package com.lxj.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixuejiao on 16/7/24.
 */
public class DemoProvider {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        context.start();
        System.in.read();
//        com.alibaba.dubbo.container.Main.main(args);
    }
}
