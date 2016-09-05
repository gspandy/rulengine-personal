package com.personal.rulengine.mamager.cxf.callback.server;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

/**
 * 服务端请求验证
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年9月5日上午10:40:04
 *
 */
public class ServerPasswordCallbackHandler implements CallbackHandler {

	private static String userName="abc";//正确的用户身份
	private static String password="123456";//正确的用户身份
	
	
	/**
	 * 请求参数
	 * <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:web2="http://web2.cxf.mamager.rulengine.personal.com/">
   
 <soapenv:Header>
    <wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" soapenv:mustUnderstand="1">
      <wsse:UsernameToken wsu:Id="UsernameToken-581191d1-7dcb-479b-a739-0ebb063d740f">
        <wsse:Username>abc</wsse:Username>
        <wsse:Password Type="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText">123456</wsse:Password>
      </wsse:UsernameToken>
    </wsse:Security>
    <auth xmlns="http://www.tmp.com/auth">
      <name>abc</name>
      <password>123456</password>
    </auth>
  </soapenv:Header>
  
   <soapenv:Body>
      <web2:getPerson>
         <arg0>100</arg0><arg1>刘保</arg1>
         <!--Optional:-->
      </web2:getPerson>
   </soapenv:Body>
</soapenv:Envelope>
	 */
	@Override
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		//校验用户身份
		WSPasswordCallback wsPasswordCallback =(WSPasswordCallback)callbacks[0];
		String userName_fromclient = wsPasswordCallback.getIdentifier();//从客户端传过来的用户身份
		if(userName_fromclient.equals(userName)){//如果客户端传过来的用户身份等正确的用户身份
			//用户身份校验通过。。。
			//如果校验用户身份通过这时将正确的密码填充由cxf自动校验密码
			wsPasswordCallback.setPassword(password);//填充正确的密码
		}else{
			//用户身份就不合法
			throw new IOException("用户身份不合法");
		}
		
		
	}

}
