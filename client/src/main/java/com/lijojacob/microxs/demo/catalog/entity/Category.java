package com.lijojacob.microxs.demo.catalog.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.TextScore;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by lijojacob on 8/11/16.
 */
@Document
public @Data class Category {

    @Id
    private String id;

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

    @DBRef
    private Catalog catalog;

    @TextIndexed
    private List<String> keywords;

    @DBRef
    private Category defaultParentCategory;

    @DBRef
    private Media template;

    @DBRef
    private Media thumbnailImage;

    @DBRef
    private Media smallImage;

    @DBRef
    private Media largeImage;

    @DBRef(lazy = true)
    private Map<String, Media> auxiliaryMedia;

    @DBRef(lazy = true)
    private List<Category> fixedParentCategories;

    @Transient
    private List<Category> ancestorCategories;

    @Transient
    private List<Category> fixedChildCategories;

    private List<String> sites;

    @TextScore
    private Float score;
    
}
