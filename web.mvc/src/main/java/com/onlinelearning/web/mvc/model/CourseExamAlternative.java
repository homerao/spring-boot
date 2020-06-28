package com.onlinelearning.web.mvc.model;

import java.io.Serializable;

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
@Table(name = "EXAM_ALTERNATIVES")
public class CourseExamAlternative extends AbstractSuperClass implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ALTERNATIVE_ID", nullable = false)
    private Long alternativeId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "QUESTION_ID", name = "QUESTION_ID")
    private CourseQuestion question;
	@Column(name = "QUESTION_TEXT", length = 400)
    private String questionText;
	@Column(name = "QUESTION_ALTERNATIVE")
    private int questionAlternative;
    
    public CourseExamAlternative() {
	
	}

	public CourseExamAlternative(CourseQuestion question, String questionText, int questionAlternative) {
		super();
		this.question = question;
		this.questionText = questionText;
		this.questionAlternative = questionAlternative;
	}
    
    
	
}
