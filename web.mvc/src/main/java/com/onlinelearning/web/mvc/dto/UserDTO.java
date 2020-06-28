package com.onlinelearning.web.mvc.dto;

import com.onlinelearning.web.mvc.model.enums.Gender;
import com.onlinelearning.web.mvc.model.enums.UserType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class UserDTO {

	private String fullName;
	private String title;
	private Gender gender;
	private UserType type;
	
	public UserDTO() {
		
	}

	public UserDTO(String fullName, String title, Gender gender, UserType type) {
		super();
		this.fullName = fullName;
		this.title = title;
		this.gender = gender;
		this.type = type;
	}
	
	
}
