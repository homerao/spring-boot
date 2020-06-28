package com.onlinelearning.web.mvc.model.pk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
public class UserPk implements Serializable{
    

	private static final long serialVersionUID = 1L;

    
	@Column(name = "USER_ID")
	private Long userId;
	
	@Column(name ="CPF", length = 11, unique = true)
	private String cpf;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
