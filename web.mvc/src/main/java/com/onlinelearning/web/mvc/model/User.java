package com.onlinelearning.web.mvc.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.onlinelearning.web.mvc.model.enums.Gender;
import com.onlinelearning.web.mvc.model.enums.UserType;
import com.onlinelearning.web.mvc.model.pk.UserPk;

import lombok.NoArgsConstructor;
@org.springframework.data.relational.core.mapping.Table
@Entity
@Table(name = "USERS")
public class User  extends AbstractSuperClass implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID", nullable = false)
	private Long userId;
	@Column(name = "CPF", nullable = false, unique = true, length = 11)
	private String cpf;
	@Column(name = "FULL_NAME", length = 50 )
	private String fullName;
	@Column(name = "USER_TYPE")
	@Enumerated(EnumType.STRING)
	private UserType type;
	@Column(name = "GENDER")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Column(name = "TITLE", length = 40)
	private String title;
	
    public User() {
		
	}

	public User(Long userId, String cpf, String fullName, UserType type, Gender gender, String title) {
		super();
		this.userId = userId;
		this.cpf = cpf;
		this.fullName = fullName;
		this.type = type;
		this.gender = gender;
		this.title = title;
	}
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
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public UserType getType() {
		return type;
	}
	public void setType(UserType type) {
		this.type = type;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@Override
	public String toString() {
		
		return String.format("Nome:{0} Tipo:{1} Gênero:{2} Título:{3}", fullName,gender,title);
	}
	
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Optional<Object> usuarioOpcional = Optional.ofNullable(obj);
		return this.equals(usuarioOpcional);
	}
	

}
