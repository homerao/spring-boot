package com.onlinelearning.web.mvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table( name = "CATEGORIES")
public class Category extends AbstractSuperClass implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CATEGORY_ID", nullable = false)
	private Long categoryId;
	@Column(name = "CATEGORY_NAME", length = 30)
	private String categoryName;
	@Column(name = "CATEGORY_SLUG", length = 3)
	private String categorySlug;
	
	public Category() {
		
	}

	public Category(String categoryName, String categorySlug) {
		super();
		this.categoryName = categoryName;
		this.categorySlug = categorySlug;
	}
	
	
	

}
