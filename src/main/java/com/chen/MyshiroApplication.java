package com.chen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Carl
 */
@SpringBootApplication
@MapperScan("com.chen.mapper")
public class MyshiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyshiroApplication.class, args);
    }

}
