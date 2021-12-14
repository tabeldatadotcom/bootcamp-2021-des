package com.maryanto.dimas.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Bootcamp2021DesApplication {

    @Bean
    public String getNama() {
        return "Dimas Maryanto";
    }

    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(Bootcamp2021DesApplication.class, args);

        String value = run.getBean("getNama", String.class);
        System.out.println("value: " + value);
    }

}
