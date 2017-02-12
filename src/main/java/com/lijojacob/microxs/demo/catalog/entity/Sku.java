package com.lijojacob.microxs.demo.catalog.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Map;
import java.util.Set;

@Document
public @Data class Sku {

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
	
	private Double listPrice;
	
	private Double salePrice;
	
	private Boolean onSale;
	
	private Boolean nonreturnable;
	
	private Boolean discountable;
	
	@TextIndexed
	private String manufacturerPartNumber;
	
	private Boolean onlineOnly;
	
	private Map<String, String> dynamicAttributes;
	
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
	
	private Double quantity;
	
	private	UnitOfMeasure unitOfMeasure;

	private Set<String> sites;

	

}
