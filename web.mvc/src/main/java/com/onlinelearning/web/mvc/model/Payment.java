package com.onlinelearning.web.mvc.model;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@org.springframework.data.relational.core.mapping.Table
@Entity
@Table(name = "PAYMENTS")
public class Payment extends AbstractSuperClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name =  "PAYMENT_ID")
	private Long paymentId;
	@OneToOne
	@JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID" )
	private CourseOrder order;
	@Column(name = "PAYMENT_TYPE")
	@Enumerated(EnumType.STRING)
	private PaymentType type;
	
	
	public Payment() {
		// TODO Auto-generated constructor stub
	}


	public Payment(Long paymentId, CourseOrder order, PaymentType type) {
		super();
		this.paymentId = paymentId;
		this.order = order;
		this.type = type;
	}


	public Long getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}


	public CourseOrder getOrder() {
		return order;
	}


	public void setOrder(CourseOrder order) {
		this.order = order;
	}


	public PaymentType getType() {
		return type;
	}


	public void setType(PaymentType type) {
		this.type = type;
	}
	
	

	
}
