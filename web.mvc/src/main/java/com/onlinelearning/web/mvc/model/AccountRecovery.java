package com.onlinelearning.web.mvc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@org.springframework.data.relational.core.mapping.Table
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "ACCOUNT_RECOVERY")
public class AccountRecovery extends AbstractSuperClass implements Serializable {


	private static final long serialVersionUID = -7579299961867415602L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RECOVERY_ID")
	private Long recoveryId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "ACCOUNT_ID", name = "ACCOUNT_ID")
	private Account account = new Account();
	@Column(name = "RECOVERY_DATE")
	private Date recoveryDate;
	@Column(name = "REC_TOKEN")
	private String recoveryToken;
	@Column(name = "IP_RECOVERY")
	private String recoveryIp;
	@Column(name = "APP_NAME_REC")
	private String appNameRecovery;
	@Column(name = "IS_EXPIRED")
	private Character is_expired;
	@Column(name = "EXPIRATION_DATE")
	private Date expirationDate;
	
	public AccountRecovery() {
		
	}

	public AccountRecovery(Date recoveryDate, String recoveryToken, String recoveryIp, String appNameRecovery,
			Character is_expired, Date expirationDate) {
		super();
		this.recoveryDate = recoveryDate;
		this.recoveryToken = recoveryToken;
		this.recoveryIp = recoveryIp;
		this.appNameRecovery = appNameRecovery;
		this.is_expired = is_expired;
		this.expirationDate = expirationDate;
	}
	
	
}
