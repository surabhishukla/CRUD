package com.example.ashwani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class AshwaniApplication {

    public static void main(String[] args) {
        SpringApplication.run(AshwaniApplication.class, args);
    }

}
