package com.onlinelearning.web.mvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@EqualsAndHashCode
@ToString
@Entity
@Table(name = "API_ACCESS")
public class ApiAccess extends AbstractSuperClass implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "API_ID", nullable = false)
    private Long apiId;
	@OneToMany
	@JoinColumn( referencedColumnName = "USER_ID" ,name = "USER_ID")
	@Fetch(FetchMode.JOIN)
    private User user = new User();
	@Column(name = "API_NAME", length = 50)
    private String apiName;
	@Column(name = "API_SECRET_WORD", length = 40)
    private String apiSecretWord;
	@Column(name = "API_SECRET_TOKEN", length = 128)
    private String apiSecretToken;
	
	
	public ApiAccess() {
		
	}


	public ApiAccess(String apiName, String apiSecretWord, String apiSecretToken) {
		super();
		this.apiName = apiName;
		this.apiSecretWord = apiSecretWord;
		this.apiSecretToken = apiSecretToken;
	}


	public Long getApiId() {
		return apiId;
	}


	public void setApiId(Long apiId) {
		this.apiId = apiId;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getApiName() {
		return apiName;
	}


	public void setApiName(String apiName) {
		this.apiName = apiName;
	}


	public String getApiSecretWord() {
		return apiSecretWord;
	}


	public void setApiSecretWord(String apiSecretWord) {
		this.apiSecretWord = apiSecretWord;
	}


	public String getApiSecretToken() {
		return apiSecretToken;
	}


	public void setApiSecretToken(String apiSecretToken) {
		this.apiSecretToken = apiSecretToken;
	}
	
	
	
	
}
