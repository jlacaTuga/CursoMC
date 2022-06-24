package com.tuga.cursomc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"resources"})
public class CursoMcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CursoMcApplication.class, args);
    }

}
