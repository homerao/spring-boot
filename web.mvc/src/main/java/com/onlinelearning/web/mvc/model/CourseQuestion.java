package com.onlinelearning.web.mvc.model;

import java.io.Serializable;

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

@Entity
@Table(name = "EXAM_QUESTIONS")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CourseQuestion extends AbstractSuperClass implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QUESTION_ID")
    private Long questionId;
	@ManyToOne
	@JoinColumn(name = "EXAM_ID", referencedColumnName = "EXAM_ID")
    private CourseExam exam;
	@Column(name = "QUESTION_TEXT", length = 400)
    private String questionText;
    
    public CourseQuestion() {
		
	}

	public CourseQuestion(CourseExam exam, String questionText) {
		super();
		this.exam = exam;
		this.questionText = questionText;
	}


    
	
}
