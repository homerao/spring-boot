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
@Table(name = "COURSE_MEDIA_CONTENT")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CourseMedia extends AbstractSuperClass implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MEDIA_ID", nullable = false)
    private Long contentId;
	@JoinColumn(referencedColumnName = "COURSE_ID", name = "COURSE_ID")
	@ManyToOne
    private Course course;
	@Column(name = "CHAPTER_NUMBER")
    private int ChapterNumber;
	@Column(name = "CHAPTER_NAME", length = 100)
    private String chapterName;
	@Column(name = "TEXT_CONTENT", length = 1500)
    private String textContent;
    
    
    public CourseMedia() {
		
	}


	public CourseMedia(Course course, int chapterNumber, String chapterName, String textContent) {
		super();
		this.course = course;
		ChapterNumber = chapterNumber;
		this.chapterName = chapterName;
		this.textContent = textContent;
	}
    
    
    
	
}
