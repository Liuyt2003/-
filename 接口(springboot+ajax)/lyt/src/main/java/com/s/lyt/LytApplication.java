package com.s.lyt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class LytApplication {

    public static void main(String[] args) {
        SpringApplication.run(LytApplication.class, args);
    }

}
