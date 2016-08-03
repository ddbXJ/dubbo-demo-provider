package com.lxj.service;

import com.lxj.api.DemoService;

/**
 * Created by lixuejiao on 16/7/24.
 */
public class DemoServiceImpl implements DemoService{
    public String sayHello(String name) {
        return "hello , " + name;
    }
}
