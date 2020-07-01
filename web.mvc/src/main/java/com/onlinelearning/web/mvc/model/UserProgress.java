package com.onlinelearning.web.mvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
@Table(name = "USER_MODULE_PROGRESSIONS")
public class UserProgress extends AbstractSuperClass implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROGRESSION_ID")
    private Long progressId;
	@OneToOne
	@JoinColumn(name = "MODULE_ID", referencedColumnName = "MODULE_ID")
	@Fetch(FetchMode.JOIN)
    private CourseModule moduleId;
	@OneToOne
	@JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
	@Fetch(FetchMode.JOIN)
    private User user;
	@Column(name = "MODULE_PROGRESS")
    private int moduleProgress;
	@Column(name = "MODULE_PERCENTAGE")
    private double modulePercentage;
    
    
    public UserProgress() {
		
	}


	public UserProgress(CourseModule moduleId, User user, int moduleProgress, double modulePercentage) {
		super();
		this.moduleId = moduleId;
		this.user = user;
		this.moduleProgress = moduleProgress;
		this.modulePercentage = modulePercentage;
	}


	
    
    
}
