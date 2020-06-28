package com.onlinelearning.web.mvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "COURSE_MODULES")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CourseModule extends AbstractSuperClass implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MODULE_ID", nullable = false)
    private Long moduleId;
	@ManyToOne
	@JoinColumn(referencedColumnName = "COURSE_ID", name = "COURSE_ID")
    private Course course;
	@Column(name = "MODULE_NAME")
    private String moduleName;
	@Column(name = "MODULE_LEVEL")
	@Enumerated(EnumType.STRING)
    private ModuleLevel level;
	@Column(name = "MODULE_NUMBER")
    private int moduleNumber;
	@Column(name = "MODULE_DESCRIPTION")
    private String moduleDescription;
	
	public CourseModule() {
	
	}

	public CourseModule( Course course, String moduleName, ModuleLevel level, int moduleNumber,
			String moduleDescription) {
		super();
		this.course = course;
		this.moduleName = moduleName;
		this.level = level;
		this.moduleNumber = moduleNumber;
		this.moduleDescription = moduleDescription;
	}
	
	
}
