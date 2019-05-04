package com.xxx;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication标注主程序类
 */
@SpringBootApplication
public class HelloWordMainApplication {

    public static void main(String[] args) {
        //启动SPring应用
        SpringApplication.run(HelloWordMainApplication.class, args);
    }
}
