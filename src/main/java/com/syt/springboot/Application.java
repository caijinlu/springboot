package com.syt.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  启动类
 * @author 0200077
 * @create 2018-10-30 10:26
 **/
@MapperScan("com.syt.springboot.dao")
@SpringBootApplication
public class Application extends SpringBootServletInitializer{

    @RequestMapping("hello")
    public String hello(){
        return  "Hello Word!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
