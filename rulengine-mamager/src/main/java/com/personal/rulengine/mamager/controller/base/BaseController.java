package com.personal.rulengine.mamager.controller.base;

import java.io.BufferedReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.personal.rulengine.mamager.controller.result.ErrorCodeConsField;
import com.personal.rulengine.mamager.controller.result.ResultErrorInfo;
import com.personal.rulengine.mamager.controller.result.ResultInfo;
import com.personal.rulengine.mamager.controller.result.ResultInfoUtil;
import com.personal.rulengine.server.api.exception.PermissionException;

/**
 * 构造的基础Controller类
 * 
 * @author Liubao
 * @2015年3月18日
 * 
 */
public abstract class BaseController<T extends BaseController<T>> {
    
    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    private Class<T> controllerClass;

    private static final Map<Class<?>, Logger> loggersMap = new HashMap<Class<?>, Logger>();

    @Autowired
    private MessageSource messageSource;

    @SuppressWarnings("unchecked")
    public BaseController() {
        Type[] types = ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments();
        this.controllerClass = (Class<T>) types[0];
    }

    public String getMessage(String code, Object[] args, String defaultMessage) {
        return messageSource.getMessage(code, args, defaultMessage,Locale.CHINA);
    }

    public String getMessage(String code) {
        return this.getMessage(code, null);
    }

    public String getMessage(String code, Object[] args) {
        return messageSource.getMessage(code, args, Locale.CHINA);
    }

    @ExceptionHandler
    public @ResponseBody Object exceptionHandler(Throwable ex, HttpServletRequest request) {

        if (!(ex instanceof PermissionException)) {
            logRequest(request, ex);
        }

        String code = ResultInfoUtil.ERROR;
        String msg = "";

        if (ex instanceof SQLException) {
            //可以返回页面,也可以返回json格式数据
            return new ModelAndView("error");
        }else if (ex instanceof ArithmeticException) {
            code = ErrorCodeConsField.ERROR_MSG_10002;
            msg = getMessage(code);
        }else if (ex instanceof PermissionException) {
            code = ((PermissionException) ex).getErrorCode();
            msg = ((PermissionException) ex).getErrorMessage();
        } else if (ex instanceof HttpMediaTypeNotSupportedException) {
            msg = getMessage("content.type.not.supported",
                    new String[] { request.getContentType() });
        } else if (ex instanceof HttpMessageNotReadableException) {
            msg = getMessage("content.not.readable");
        } else {
            msg = getMessage("system.error");
        }
        return ResultInfoUtil.setErrorInfo(code, msg);
    }

    @RequestMapping("**")
    public @ResponseBody ResultInfo notFoundHandler(HttpServletRequest request) {
        logger.warn("== request not supported =============="+ getRequestInfo(request));
        return ResultInfoUtil.setErrorInfo(ErrorCodeConsField.ERROR_MSG_10002,
                getMessage(ErrorCodeConsField.ERROR_MSG_10002));
    }

    protected ResultInfo checkBindingResult(BindingResult bindingResult) {
        ResultInfo resultInfo = new ResultErrorInfo();
        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            if (errors != null) {
                for (ObjectError objError : errors) {
                    resultInfo.setErrorCode(getErrorFieldName(objError));
                    resultInfo.setErrorMessage(getErrorMessage(objError));
                    break;
                }
            }
        }
        return resultInfo;
    }

    private String getErrorFieldName(ObjectError objError) {
        String code = objError.getCodes()[0];
        int idx = code.lastIndexOf(".");
        return idx < 0 ? code : code.substring(idx + 1);
    }

    private String getErrorMessage(ObjectError objError) {
        if (objError.getCodes() != null) {
            for (String code : objError.getCodes()) {
                String msg = getMessage(code, objError.getArguments());
                if (StringUtils.isNotEmpty(msg) && !msg.equals(code)) {
                    return msg;
                }
            }
        }
        return objError.getDefaultMessage();
    }

    protected Logger getLogger() {
        return getLogger(this.controllerClass);
    }

    private static Logger getLogger(Class<?> clazz) {
        Logger logger = loggersMap.get(clazz);
        if (logger == null) {
            logger = LoggerFactory.getLogger(clazz);
            loggersMap.put(clazz, logger);
        }
        return logger;
    }

    protected void logRequest(HttpServletRequest request) {
        getLogger().warn(getRequestInfo(request));
    }

    protected void logRequest(HttpServletRequest request, Throwable ex) {
        getLogger().error(getRequestInfo(request), ex);
    }

    @SuppressWarnings("rawtypes")
    protected String getRequestInfo(HttpServletRequest request) {
        StringBuilder headers = new StringBuilder();
        Enumeration headerNames = request.getHeaderNames();
        if (headerNames.hasMoreElements()) {
            headers.append("\r\nheaders: {");
            while (headerNames.hasMoreElements()) {
                String name = (String) headerNames.nextElement();
                headers.append("\r\n").append(name).append("=")
                        .append(request.getHeader(name));
            }
            headers.append("\r\n}");
        }

        StringBuilder parameters = new StringBuilder();
        Enumeration parameterNames = request.getParameterNames();
        if (parameterNames.hasMoreElements()) {
            parameters.append("\r\nparameters: {");
            while (parameterNames.hasMoreElements()) {
                String parameter = (String) parameterNames.nextElement();
                parameters.append("\r\n").append(parameter).append("=")
                        .append(request.getParameter(parameter));
            }
            parameters.append("\r\n}");
        }

        StringBuilder content = new StringBuilder();
        if (!"multipart/form-data".equalsIgnoreCase(request.getContentType())) {
            try {
                BufferedReader r = request.getReader();
                String line = null;
                while ((line = r.readLine()) != null) {
                    content.append(line);
                }
            } catch (Exception ex) {

            }
        }

        Enumeration attrNames = request.getAttributeNames();
        if (attrNames.hasMoreElements()) {
            content.append("\r\nattributes:");
            while (attrNames.hasMoreElements()) {
                String attrName = (String) attrNames.nextElement();
                content.append("\r\n").append(attrName).append(":")
                        .append(request.getAttribute(attrName));
            }
        }

        return "\r\n>>> request >>>>>>" + headers.toString()
                + "\ncontentType: " + request.getContentType() + "\npathInfo: "
                + request.getPathInfo() + "\npathTranslated: "
                + request.getPathTranslated() + "\nremoteAddr: "
                + request.getRemoteAddr() + "\nremoteHost: "
                + request.getRemoteHost() + "\nrequestURI: "
                + request.getRequestURI() + "\nservletPath: "
                + request.getServletPath() + parameters.toString()
                + "\ncontent ---\n" + content.toString() + "\n-----\n";
    }
    
}
