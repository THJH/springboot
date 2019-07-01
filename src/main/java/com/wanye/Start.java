package com.wanye;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class Start {//@SpringBootApplication
    //@Configuration理解为xml的配置文件
    //@ComponentScan扫描包
    //@EnableAutoConfiguration注入依赖
    public static void main(String[] args) {
        SpringApplication.run(Start.class,args);
    }
}
