package com.itlize.firstProject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itlize.firstProject.*"})
@EntityScan(basePackages = {"com.itlize.firstProject.*"})
@EnableJpaRepositories(basePackages = {"com.itlize.firstProject.*"})
public class ProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class);
    }
}
