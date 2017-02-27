package com.lijojacob.microxs.demo.catalog.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by lijojacob on 8/11/16.
 */
@Document
public @Data class Catalog {

    @Id
    private String id;

    private String displayName;

    private List<Category> rootCategories;

}
