package com.personal.rulengine.mamager.cxf.callback.client;
import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;


/**
 * 客户端调用的时候,需要配置此项
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年9月5日上午10:39:41
 *
 */
public class ClientPasswordCallbackHandler implements CallbackHandler {

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
        pc.setIdentifier("abc");
        pc.setPassword("123456");
    }

}