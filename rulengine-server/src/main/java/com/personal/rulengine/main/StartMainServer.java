package com.personal.rulengine.main;

/**
 * 启动 dubbo 服务
 * 
 * @Author LiuBao
 * @Version 0.1
 * @Comp personal
 * @Date 2016年7月22日上午11:25:40
 * 
 */
public class StartMainServer {
    
    public static void main(String[] args) {
        com.alibaba.dubbo.container.Main.main(args);
        System.out.println("StartMainServer.main执行完成...");
    }
    
}
