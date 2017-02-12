package com.lijojacob.microxs.demo.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lijojacob on 2/11/17.
 */
@SpringBootApplication(scanBasePackages = {"com.lijojacob.microxs.demo.catalog"})
public class CatalogServer {

    public static void main(String[] args) {
        SpringApplication.run(CatalogServer.class, args);
    }

}
