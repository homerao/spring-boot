package com.onlinelearning.web.mvc.model;

import java.io.Serializable;
import java.util.Date;

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


@EqualsAndHashCode
@Getter
@Setter
@ToString
@Entity
@Table(name = "REGISTRATIONS")
public class CourseRegistration extends AbstractSuperClass implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REGISTRATION_ID")
    private Long registrationId;
	@OneToOne
	@JoinColumn(name = "COURSE_ID", referencedColumnName = "COURSE_ID")
    private Course course;
	@OneToOne
	@JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    private User user;
	@Column(name = "REGISTRATION_DATE")
    private Date registrationDate;
	@Column(name = "EXPIRATION_DATE")
    private Date expirationDate;
    
    
    
    public CourseRegistration() {
		
	}



	public CourseRegistration(Course course, User user, Date registrationDate, Date expirationDate) {
		super();
		this.course = course;
		this.user = user;
		this.registrationDate = registrationDate;
		this.expirationDate = expirationDate;
	}
    
    
    
}
