package com.wanye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@Controller//控制器+ @ResponseBody//将数据也文本的形式返回原本返回
@RestController
public class HelloController {
    @RequestMapping("/hello")//提供路由访问路径
    public Map<String,String> hello(){
        HashMap<String,String> hello = new HashMap<>();
        hello.put("data","hello 小红");
        hello.put("status","成功");
        return  hello;
    }
}
