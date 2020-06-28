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
public class CourseCertificate extends AbstractSuperClass implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CERTIFICATE_ID")
	private Long certificateId;
	@OneToOne
	@JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
	private User user;
	@OneToOne
	@JoinColumn(name = "COURSE_ID", referencedColumnName = "COURSE_ID")
	private Course course;
	
	
	public CourseCertificate() {
		// TODO Auto-generated constructor stub
	}


	public CourseCertificate(User user, Course course) {
		super();
		this.user = user;
		this.course = course;
	}
	
	

}
