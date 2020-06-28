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
import javax.persistence.OneToOne;
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
@Table(name = "COURSE_EXAMS")
public class CourseExam extends AbstractSuperClass implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EXAM_ID", nullable = false)
    private Long examId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "MODULE_ID", name = "MODULE_ID")
    private CourseModule module;
	@Column(name = "EXAM_NAME")
    private String examName;
	@Column(name = "TIME_TO_FINISH")
    private int timeToFinish;
	@Column(name = "QUESTION_COUNT")
    private int questionCount;
	@Enumerated(EnumType.STRING)
	@Column(name = "EXAM_LEVEL")
	private ExamLevel examLevel;
	@Enumerated(EnumType.STRING)
	@Column(name = "EXAM_CATEGORY")
	private ExamCategory examCategory;
	@Enumerated(EnumType.STRING)
	@Column(name = "TECHNOLOGY_NAME")
	private TechnologyName techName;
	
	public CourseExam() {
		
	}

	public CourseExam(CourseModule module, String examName, int timeToFinish, int questionCount, ExamLevel examLevel,
			ExamCategory examCategory, TechnologyName techName) {
		super();
		this.module = module;
		this.examName = examName;
		this.timeToFinish = timeToFinish;
		this.questionCount = questionCount;
		this.examLevel = examLevel;
		this.examCategory = examCategory;
		this.techName = techName;
	}
	
	
}
