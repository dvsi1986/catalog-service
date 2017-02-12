package com.lijojacob.microxs.demo.catalog.entity;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by lijojacob on 8/11/16.
 */
@Document
public @Data class Product {

    @Id
    private String id;

    @JsonPropertyDescription("Version of product")
    private int version;

    @TextIndexed
    private String displayName;

    private Date creationDate;

    private Date startDate;

    private Date endDate;

    @TextIndexed
    private String description;

    @TextIndexed
    private String longDescription;

    private Boolean nonreturnable;

    private Boolean discountable;

    private String brand;

    private Boolean disallowAsRecommendation;

    private Boolean onlineOnly;

    @TextIndexed
    private List<String> keywords;

    @DBRef
    private Manufacturer manufacturer;

    @DBRef
    private Category defaultParentCategory;

    @DBRef(lazy = true)
    private List<Sku> childSkus;

    private List<Image> images;


    @DBRef(lazy = true)
    private Map<String, Media> auxiliaryMedia;

    private List<String> displayableSkuAttributes;

    @DBRef(lazy = true)
    private List<Category> fixedParentCategories;
    
}
