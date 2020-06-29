package com.onlinelearning.web.mvc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.EqualsAndHashCode;
import lombok.ToString;






@Table(name = "EMAILS")
@Entity
public class Email extends AbstractSuperClass implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMAIL_ID")
    private Long emailId;
	@ManyToOne
	@JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ACCOUNT_ID")
	@Fetch(FetchMode.JOIN)
    private Account account;
	@Column(name = "TITLE")
    private String title;
	@Column(name = "MESSAGE")
    private String message;
	@Column(name = "SENDER")
    private String sender;
	@Column(name = "RECEIVER")
    private String receiver;
    
    
    public Email() {
		
	}


	public Email(Long emailId, Account account, String title, String message, String sender, String receiber) {
		super();
		this.emailId = emailId;
		this.account = account;
		this.title = title;
		this.message = message;
		this.sender = sender;
		this.receiver = receiber;
	}


	public Long getEmailId() {
		return emailId;
	}


	public void setEmailId(Long emailId) {
		this.emailId = emailId;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getSender() {
		return sender;
	}


	public void setSender(String sender) {
		this.sender = sender;
	}


	public String getReceiber() {
		return receiver;
	}


	public void setReceiber(String receiber) {
		this.receiver = receiber;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

    @Override
    public String toString() {
    	
    	return java.text.MessageFormat.format("Email{0}", this.receiver);
    }
	
}
