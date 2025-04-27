package org.example.cicd250426;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Cicd250426Application {

    public static void main(String[] args) {
        SpringApplication.run(Cicd250426Application.class, args);
    }

}
