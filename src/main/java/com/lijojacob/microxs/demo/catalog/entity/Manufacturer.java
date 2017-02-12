package com.lijojacob.microxs.demo.catalog.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public @Data class Manufacturer {

	@Id
	private String id;

	@TextIndexed
	private String displayName;
	
	@TextIndexed
	private String description;
	
	@TextIndexed
	private String longDescription;
	
	private String email;
	

}
