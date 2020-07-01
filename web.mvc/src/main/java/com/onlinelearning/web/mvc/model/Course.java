package com.onlinelearning.web.mvc.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@org.springframework.data.relational.core.mapping.Table
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "COURSES")
public class Course extends AbstractSuperClass implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COURSE_ID", nullable = false)
    private Long courseId;
	@OneToOne
	@JoinColumn( referencedColumnName = "USER_ID",name = "USER_ID")
    private User user = new User();
	@OneToOne
	@JoinColumn( referencedColumnName = "CATEGORY_ID", name = "CATEGORY_ID")
    private Category category = new Category();
	@Column(name = "COURSE_NAME")
    private String courseName;
	@Column(name = "HOURS_LONG")
    private Double hoursLong;
	@Column(name = "VALID_UNTIL")
    private int validUntil;
	@Column(name = "COURSE_VALUE")
	private BigDecimal courseValue;
	@Column(name = "COURSE_PICTURE_PATH")
    private String coursePicturePath;
	@Column(name = "COURSE_DESCRIPTION")
    private String courseDescription;

    
    public Course() {
		
	}


	public Course(User user, Category category, String courseName, Double hoursLong, int validUntil,
			BigDecimal courseValue, String coursePicturePath, String courseDescription) {
		super();
		this.user = user;
		this.category = category;
		this.courseName = courseName;
		this.hoursLong = hoursLong;
		this.validUntil = validUntil;
		this.courseValue = courseValue;
		this.coursePicturePath = coursePicturePath;
		this.courseDescription = courseDescription;
	}


    
    
}
