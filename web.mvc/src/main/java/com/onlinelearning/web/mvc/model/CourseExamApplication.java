package com.onlinelearning.web.mvc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "EXAM_APPLICATIONS")
public class CourseExamApplication extends AbstractSuperClass implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "APPLICATION_ID", nullable = false)
    private Long applicationId;
	@JoinColumn(referencedColumnName = "USER_ID", name = "USER_ID" )
	@ManyToOne(cascade = CascadeType.ALL)
    private User user;
	@JoinColumn(referencedColumnName = "EXAM_ID" , name = "EXAM_ID")
	@ManyToOne(cascade = CascadeType.ALL)
    private CourseExam exam;
	@Column(name = "IS_APROVED")
    private boolean isAproved;
	@Column(name = "RIGHT_ANSWERS")
    private int rightAnswers;
	@Column(name = "APPLICATION_DATE")
    private Date applicationDate;
	
    
    public CourseExamApplication() {
		
	}


	public CourseExamApplication(User user, CourseExam exam, boolean isAproved, int rightAnswers,
			Date applicationDate) {
		super();
		this.user = user;
		this.exam = exam;
		this.isAproved = isAproved;
		this.rightAnswers = rightAnswers;
		this.applicationDate = applicationDate;
	}
    
    
}
