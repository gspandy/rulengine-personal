package com.personal.rulengine.mamager.controller.base;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONException;
import com.personal.rulengine.common.utils.PrintLogUtil;
import com.personal.rulengine.mamager.controller.result.ErrorCodeConsField;
import com.personal.rulengine.mamager.controller.result.ResultInfoUtil;


public class CommonController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private MessageSource messageSource;
	
    public String getMessage(String code, Object[] args, String defaultMessage) {
        return messageSource.getMessage(code, args, defaultMessage, Locale.CHINA);
    }

    public String getMessage(String code) {
        return this.getMessage(code, null);
    }

    public String getMessage(String code, Object[] args) {
        return messageSource.getMessage(code, args, Locale.CHINA);
    }
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseBody
	public Object handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		BindingResult bindingResult = ex.getBindingResult();
		String errorMesssage = "Invalid Request:";

		for (FieldError fieldError : bindingResult.getFieldErrors()) {
			errorMesssage += fieldError.getDefaultMessage() + ",";
		}
		if(errorMesssage.lastIndexOf(",")==errorMesssage.length()-1){
		    errorMesssage=errorMesssage.substring(0, errorMesssage.length()-1);
		}
		logger.error(bindingResult.getFieldError().getDefaultMessage());
		return ResultInfoUtil.setErrorInfo(ErrorCodeConsField.ERROR_MSG_10005, 
		        getMessage(ErrorCodeConsField.ERROR_MSG_10005)+errorMesssage);
	}

	/**
	 *  JSON convert exception
	 * @param ex
	 * @return
	 */
	@ExceptionHandler({HttpMessageNotReadableException.class,JSONException.class})
	@ResponseBody
	public Object handleHttpMessageNotReadableException(RuntimeException ex) {
		logger.error(PrintLogUtil.getStackTrace(ex));
		String errorMesssage = "JSON convert failure: "+ex.getLocalizedMessage();
		return ResultInfoUtil.setErrorInfo(ErrorCodeConsField.ERROR_MSG_10005, 
		        getMessage(ErrorCodeConsField.ERROR_MSG_10005)+errorMesssage);
	}
	
}
