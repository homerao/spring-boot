package com.onlinelearning.web.mvc.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@org.springframework.data.relational.core.mapping.Table
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
	@Fetch(FetchMode.JOIN)
    private CourseQuestion question;
	@Column(name = "ALTERNATIVE_TEXT", length = 400)
    private String questionText;
	@Column(name = "ALTERNATIVE_TYPE")
	@Enumerated(EnumType.STRING)
    private AlternativeType questionAlternative;
	@Column(name =  "IS_RIGHT_ANSWER")
	private Character isRightAnswer;
    
    public CourseExamAlternative() {
	
	}

	public CourseExamAlternative(Long alternativeId, CourseQuestion question, String questionText,
			AlternativeType questionAlternative, Character isRightAnswer) {
		super();
		this.alternativeId = alternativeId;
		this.question = question;
		this.questionText = questionText;
		this.questionAlternative = questionAlternative;
		this.isRightAnswer = isRightAnswer;
	}

	
    
    
	
}
