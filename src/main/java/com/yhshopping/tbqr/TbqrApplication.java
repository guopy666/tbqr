package com.yhshopping.tbqr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yhshopping.tbqr.dao")
public class TbqrApplication {

    public static void main(String[] args) {
        SpringApplication.run(TbqrApplication.class, args);
    }

}
