package com.lijojacob.microxs.demo.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by lijojacob on 2/11/17.
 */
@SpringBootApplication(scanBasePackages = {"com.lijojacob.microxs.demo.catalog"})
@EnableMongoRepositories(basePackages = "com.lijojacob.microxs.demo.catalog.repository")
public class CatalogServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "catalog-service");
        SpringApplication.run(CatalogServer.class, args);
    }

}
