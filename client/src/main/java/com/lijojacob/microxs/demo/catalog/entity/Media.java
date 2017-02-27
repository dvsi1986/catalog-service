package com.lijojacob.microxs.demo.catalog.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public @Data class Media {

	@Id
	private String id;
	
	@TextIndexed
	private String displayName;
	
	private int version;
	
	private Date creationDate;
	
	private Date startDate;
	
	private Date endDate;
	
	@TextIndexed
	private String description;
	
	private String path;
	
	@DBRef
	private Folder parentFolder;
	
}
