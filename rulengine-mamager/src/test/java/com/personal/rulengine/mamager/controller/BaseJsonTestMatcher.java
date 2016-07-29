package com.personal.rulengine.mamager.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.apache.commons.lang.StringUtils;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import com.personal.rulengine.common.utils.DatetimeUtils;
import com.personal.rulengine.common.utils.JsonUtils;
import com.personal.rulengine.mamager.controller.result.ResultSuccessInfo;


/**
 * 测试用例Matcher抽象基类，用来对response JSON对象做检查
 * 
 */
@SuppressWarnings("unchecked")
public abstract class BaseJsonTestMatcher<T extends BaseJsonTestMatcher<T, V>, V>
        extends BaseMatcher<String> {

    private Class<T> matcherClass;
    private Class<V> viewObjectClass;

    public BaseJsonTestMatcher() {
        Type[] types = ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments();
        this.matcherClass = (Class<T>) types[0];
        this.viewObjectClass = (Class<V>) types[1];
    }

    @Override
    public boolean matches(Object o) {
        String response = (String) o;
        try {
            assertNotNull(response);
            assertTrue(StringUtils.isNotEmpty(response));

            ResultSuccessInfo resultSuccessInfo = JsonUtils.fromJson(
                    ResultSuccessInfo.class, response);

            assertNotNull(resultSuccessInfo);
            assertEquals("0", resultSuccessInfo.getErrorCode());

            Object resultObj = resultSuccessInfo.getResult();

            assertNotNull(resultObj);

            List<V> viewObjs = new ArrayList<>();

            if (resultObj instanceof List) {
                List<Map<String, Object>> valueObjs = (List<Map<String, Object>>) resultObj;

                for (Map<String, Object> valueObj : valueObjs) {
                    viewObjs.add(transToViewObject(valueObj));
                }
            } else {
                viewObjs.add(transToViewObject((Map<String, Object>) resultObj));
            }

            checkResponseViewObjects(viewObjs);

            return true;

        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void describeMismatch(Object o, Description d) {
        d.appendText("invalid response >> " + o);
    }

    @Override
    public void describeTo(Description d) {
        d.appendValue(matcherClass);
    }

    protected abstract void checkResponseViewObjects(List<V> viewObjects);

    protected V transToViewObject(Map<String, Object> properties)
            throws Exception {
        V vo = newViewObject();
        BeanUtilsBean.getInstance()
                .getConvertUtils()
                .register(new DateLocaleConverter(Locale.CHINA,
                                DatetimeUtils.DATETIME_PATTERN), Date.class);
        BeanUtilsBean.getInstance().populate(vo, properties);
        return vo;
    }

    protected V newViewObject() {
        V obj = null;
        try {
            obj = this.viewObjectClass.newInstance();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return obj;
    }

}
