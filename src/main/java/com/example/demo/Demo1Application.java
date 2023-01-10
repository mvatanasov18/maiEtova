package com.example.demo;

import java.sql.Date;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {
    private  Logger logger= LoggerFactory.getLogger(this.getClass());
@Autowired
PlayerDao dao;


    public static void main(String[] args) {

        SpringApplication.run(Demo1Application.class, args);
        System.out.println("http://localhost:8080/h2-console");
        System.out.println("log with no user (user:<nothing> and password:<nothing> )");
        System.out.println("JDBC URL= jdbc:h2:file:/data/demo");
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All Players Data: {}",dao.getAllPlayers());
    }
}
