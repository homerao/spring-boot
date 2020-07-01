package com.onlinelearning.web.mvc.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

@org.springframework.data.relational.core.mapping.Table
@EqualsAndHashCode
@Getter
@Setter
@ToString
@Entity
@Table(name = "COURSE_TEXT_CONTENT")
public class CourseText extends AbstractSuperClass implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CONTENT_ID")
	private Long contentId;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "COURSE_ID", name = "COURSE_ID")
	private Course course;
	@Column(name = "CHAPTER_NUMBER")
	private int chapterNumber;
	@Column(name = "CHAPTER_NAME", length =  100)
	private String chapterName;
	@Column(name = "TEXT_CONTENT", length = 1500)
	private String textContent;
	
	public CourseText() {
		
	}

	public CourseText(Course course, int chapterNumber, String chapterName, String textContent) {
		super();
		this.course = course;
		this.chapterNumber = chapterNumber;
		this.chapterName = chapterName;
		this.textContent = textContent;
	}
	

}
