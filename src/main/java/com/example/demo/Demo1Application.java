package com.example.demo;

import java.sql.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo1Application.class, args);
        System.out.println("http://localhost:8080/h2-console");
        System.out.println("log with no user (user:<nothing> and password:<nothing> )");
        System.out.println("JDBC URL= jdbc:h2:file:/data/demo");
    }

}
