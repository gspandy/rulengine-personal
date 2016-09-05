package com.personal.rulengine.mamager.cxf.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceProvider;
import javax.xml.ws.http.HTTPBinding;

/**
 *  该类的访问地址...
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年9月4日下午5:25:59
 *
 *@BindingType 指定是soap1.1还是soap1.2协议
 */
@WebServiceProvider
@Path(value = "/student/{id}")
@BindingType(value=HTTPBinding.HTTP_BINDING)
public interface RestService {
    
    /**
     * @GET 提供对外的访问地址
     * @Path 该方法的访问地址
     * @Produces 传递数据的格式 //参数....
     *  http://localhost:8080/rulengine-mamager/ws/restService/student/888/info?name=%E5%88%98%E4%BF%9D
     *  
     *  下面这个是没有的
     *  http://localhost:8080/rulengine-mamager/ws/restService?wsdl
     */
    @GET
    @POST
    @Path(value = "/info")
    //@Produces({ "application/json" })
    @Produces({ "application/xml" })
    public Person getPerson(@PathParam("id") int id, @QueryParam("name") String name);

}
