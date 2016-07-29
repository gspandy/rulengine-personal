package com.personal.rulengine.mamager.filter;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AutoLoginFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request;
		HttpServletResponse response;
		try {
			request = (HttpServletRequest) req;
			response = (HttpServletResponse) resp;
		} catch (Exception e) {
			throw new RuntimeException("Is not a HTTP request");
		}

		// Session中保存的账号信息,其中包含了账号和密码,密码是经过加密处理的了;
		HttpSession session = request.getSession();
		
		//获取user的账户名和密码的cookie信息,下面同步有获取该账号的购物车的信息;
		Object sUser = (Object) session.getAttribute("user");
		// sUser为空,表示用户还没有登录;
		if (sUser == null) {
			Cookie cs[] = request.getCookies();
			for (int i = 0; cs != null && i < cs.length; i++) {
				// cookie中的数据(只有email,就可以查询出其对应的数据库中的密码;)
				if ("userInfo".equals(cs[i].getName())) {

					// 顺序:String
					// userInf=""+loginUser.getId()+loginUser.getEmail()+"_"+loginUser.getPassword()+
					// loginUser.getNickname()+loginUser.getRole()+loginUser.getActive()+loginUser.getActivecode();
					//编码中涉及到中文,在网络间传输的时候,需要进行url编码;
					String userInfo=URLDecoder.decode(cs[i].getValue(),"utf-8") ;
					int id = Integer.parseInt(userInfo.split("\\_")[0]);
					String email = userInfo.split("\\_")[1];
					String password = userInfo.split("\\_")[2];
					String nickname = userInfo.split("\\_")[3];
					String role = userInfo.split("\\_")[4];
					int active = Integer
							.parseInt(userInfo.split("\\_")[5]);
					String activecode = userInfo.split("\\_")[6];
					// 获取数据库中对应的email对象;
					//User findUser = userDao.findUser(email);
					// 这是查询到的数据库中的经过MD5加密的密码
					//String Spassword = findUser.getPassword();
					String Spassword = "";

					// System.out.println("在自动过滤程序中--从Cookie["+cs[i].getName()+"]中直接获取的数据并输出为:"
					//	+ cs[i].getValue());

					// System.out.println("Cookie中获取:"+new String
					// (cs[i].getValue().getBytes("iso-8859-1"),"utf-8"));
					// System.out.println(email);
					// System.out.println(password);
					// System.out.println("数据库:"+Spassword);

					if (Spassword.equals(password)) {
					    Object user1 = new Object();
						request.getSession().setAttribute("user", user1);
						
						//-----------------------------------------------------------------------
						//在这个位置将该客户的session对象中的购物车cart信息取出来
						//TODO   购物车cart信息
						
						
						
						
						
						
						
						
						
						//-----------------------------------------------------------------------
						
						
						
						break;
					}
				}
			}
		}

		chain.doFilter(request, response);
	}

	public void destroy() {

	}

}
