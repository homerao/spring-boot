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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


import lombok.EqualsAndHashCode;


@org.springframework.data.relational.core.mapping.Table
@EqualsAndHashCode
@Entity
@Table(name = "USER_ACCOUNTS")
public class Account extends AbstractSuperClass implements Serializable {

	
	private static final long serialVersionUID = -8355838328871294228L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ACCOUNT_ID")
	private Long userAccount;
	@JoinColumn(referencedColumnName = "USER_ID", name = "USER_ID")
	@OneToOne( fetch = FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
	private User user;
	@Column(name = "USER_EMAIL")
	private String email;
	@Column(name = "USER_PASSWORD")
	private String password;
	@Column(name = "IS_BLOCKED")
	private boolean isblocked;
	@Column(name = "IS_BANNED")
	private boolean isBanned;
	
	
	public Account() {
		
	}




	public Account(Long userAccount, User user, String email, String password, boolean isblocked, boolean isBanned) {
			super();
			this.userAccount = userAccount;
			this.user = user;
			this.email = email;
			this.password = password;
			this.isblocked = isblocked;
			this.isBanned = isBanned;
	}




@Override
public String toString() {
	String formated = java.text.MessageFormat.format("accountId:{0} email:{1}  isblocked:{2} isBanned:{3]", this.userAccount,this.email,this.isblocked, this.isBanned);
	return formated;
}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	public Long getUserAccount() {
		return userAccount;
	}


	public void setUserAccount(Long userAccount) {
		this.userAccount = userAccount;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}




	public boolean isIsblocked() {
		return isblocked;
	}




	public void setIsblocked(boolean isblocked) {
		this.isblocked = isblocked;
	}




	public boolean isBanned() {
		return isBanned;
	}




	public void setBanned(boolean isBanned) {
		this.isBanned = isBanned;
	}



	


	
	
	
}
