package com.onlinelearning.web.mvc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class AbstractSuperClass {

	
	@Column(name = "CREATED_AT")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date createdAt;
	@Column(name = "UPDATED_AT")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date updatedAt;
}
