package com.personal.rulengine.mamager.utils;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.personal.rulengine.mamager.controller.BaseTestController;


@SuppressWarnings("unused")
public class MessageSourceTest extends BaseTestController {

    @Autowired
    private MessageSource messageSource;

    // @Value("${system.error}")
    private String value1;

    // @Value("${phone.name}")
    private String value2;

    @Value("${orm.mysql.jdbc.password}")
    private String value3;

    @Autowired
    private ThreadPoolTaskExecutor taskExecutor;

    // @Test
    public void testGetMessage() throws Exception {
        System.out.println(messageSource.getMessage("PHONEMODEL", null,
                "默认返回值信息", null));
        System.out.println(messageSource.getMessage("orm.mysql.jdbc.password",
                null, "默认返回值信息", null));
        System.out.println(messageSource.getMessage("user.not.login", null,
                "默认返回值信息", null));
        System.out.println(messageSource.getMessage("40006", null, "默认返回值信息",
                null));
        System.out.println(messageSource.getMessage("wx_menu_create_url", null,
                "默认返回值信息", null));

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }

    /**
     * 获取当前方法名称
     */
    @Test
    public void testThreadMethodName() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("可用的处理器个数为:"+availableProcessors);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        int a1=1;
        int a2=1;
        Integer b1 =new Integer (1);
        Integer b2 =new Integer (1);
        System.out.println(a1==b1);//true
        System.out.println(b2==b1);//false
    }

    /**
     * HTTP 代理设置
     */
    @Test
    public void testToolkit() {
        Toolkit.getDefaultToolkit().getImage("");
        System.getProperties().put("http.proxyHost", "someProxyURL");
        System.getProperties().put("http.proxyPort", "someProxyPort");
        System.getProperties().put("http.proxyUser", "someUserName");
        System.getProperties().put("http.proxyPassword", "somePassword");
    }

    /**
     * 抓屏程序
     */
    @Test
    public void captureScreen() throws Exception {
        String fileName="D:\\temp\\000.png";
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle screenRectangle = new Rectangle(screenSize);
        Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(screenRectangle);
        File file = new File(fileName);
        if(!file.exists()){
            file.createNewFile();
        }
        ImageIO.write(image, "png", file);
    }

    /**
     * 测试多线程
     */
    @Test
    public void testThreadReadFile() {
        final String file = "d:\\temp\\1.txt";
        final boolean flagB;
        taskExecutor.execute(new Runnable() {
            boolean flagA = true;
            int numberA = 0;

            @SuppressWarnings("resource")
            @Override
            public void run() {
                try {
                    while (numberA++ <= 10 && flagA) {
                        System.out.println("testThread1.start...");
                        OutputStream out = new FileOutputStream(new File(file),
                                true);
                        out.write("A".getBytes());
                        out.flush();
                        System.out.println("testThread1.finished...");
                        if (numberA % 2 == 0) {
                            flagA = false;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        taskExecutor.execute(new Runnable() {
            boolean flagB = true;
            int numberB = 0;

            @SuppressWarnings("resource")
            @Override
            public void run() {
                try {
                    while (numberB++ < 10 && flagB) {
                        System.out.println("testThread1.start...");
                        OutputStream out = new FileOutputStream(new File(file),
                                true);
                        out.write("B".getBytes());
                        out.flush();
                        System.out.println("testThread1.finished...");
                        flagB = false;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("testThread.finished...");
    }

}
