package com.onlinelearning.web.mvc.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.ToString;


@EqualsAndHashCode
@ToString
@Entity
@Table(name = "USER_ADDRESS")
public class UserAddress  extends AbstractSuperClass implements Serializable{
 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDRESS_ID")
	private Long addressId;
	@Column(name = "USER_ID")
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(referencedColumnName = "USER_ID")
	private User user;
	@Column(name = "STREET_NAME")
	private String streetName;
	@Column(name = "NEIGHBORDHOOD")
	private String neighborhood;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "COUNTRY")
	private String country;
	
	
	public UserAddress() {
		
	}
	
	public UserAddress(User user, String streetName, String neighborhood, String city, String state, String country) {
		super();
		this.user = user;
		this.streetName = streetName;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	@Override
	public String toString() {
		 
		return java.text.MessageFormat.format("User:{0}, street: {1} ", user.getFullName(),streetName);
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
