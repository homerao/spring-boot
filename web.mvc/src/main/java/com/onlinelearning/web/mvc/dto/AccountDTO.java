package com.onlinelearning.web.mvc.dto;

import com.onlinelearning.web.mvc.model.User;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


@ToString
@EqualsAndHashCode
public class AccountDTO {
	
	  private Long accountId; 
	  private User userId; 
	  private String userEmail;
	  private Character isBlocked; 
	  private Character isBanned;
	  
	  
	  
	  public AccountDTO() {
	  
	  }
	  
	  
	  
	  public AccountDTO(Long accountId, User userId, String userEmail, Character isBlocked, Character isBanned) { 
	  super(); 
      this.accountId = accountId;
	  this.userId = userId; 
	  this.userEmail = userEmail; 
	  this.isBlocked = isBlocked;
	  this.isBanned = isBanned; 
	  }



	public Long getAccountId() {
		return accountId;
	}



	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}



	public User getUserId() {
		return userId;
	}



	public void setUserId(User userId) {
		this.userId = userId;
	}



	public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	public Character getIsBlocked() {
		return isBlocked;
	}



	public void setIsBlocked(Character isBlocked) {
		this.isBlocked = isBlocked;
	}



	public Character getIsBanned() {
		return isBanned;
	}



	public void setIsBanned(Character isBanned) {
		this.isBanned = isBanned;
	}
	 
     
     
}
