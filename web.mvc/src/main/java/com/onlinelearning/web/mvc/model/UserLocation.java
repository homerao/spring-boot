package com.onlinelearning.web.mvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "USER_LOCATION")
public class UserLocation extends AbstractSuperClass implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6889549186832002488L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LOCATION_ID")
	private Long locationId;
	@OneToOne
	@JoinColumn(name = "ACCOUNT_ID")
	@Fetch(FetchMode.JOIN)
	private  Account account;
	@Column(name = "APP_NAME", length = 50)
	private String appName;
	@Column(name = "LATITUDE", nullable = false)
	private Long latitude;
	@Column(name = "LONGITUDE", nullable = false)
	private Long longitude;
	
	public UserLocation() {
		
	}

	public UserLocation(Long latitude, Long longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	
	
	
	
}
