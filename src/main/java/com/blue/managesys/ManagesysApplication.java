package com.blue.managesys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.blue.managesys")
@SpringBootApplication
public class ManagesysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagesysApplication.class, args);
    }

}
