package com.onlinelearning.web.mvc.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.EqualsAndHashCode;
import lombok.ToString;



@Entity
@Table(name = "PAYMENTS")
public class Payment extends AbstractSuperClass implements Serializable {

	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PAYMENT_ID")
	private Long paymentId;
    @ManyToOne
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    @Fetch(FetchMode.JOIN)
	private CourseOrder order;
    @Column(name = "PAYMENT_VALUE")
	private BigDecimal paymentValue;
    @Column(name = "PAYMENT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
	private Date paymentDate;
    @Column(name = "PAYMENT_TYPE")
    @Enumerated(EnumType.STRING)
	private PaymentType type;
	
	
	public Payment() {
		
	}


	public Payment(Long paymentId, CourseOrder order, BigDecimal paymentValue, Date paymentDate, PaymentType type) {
		super();
		this.paymentId = paymentId;
		this.order = order;
		this.paymentValue = paymentValue;
		this.paymentDate = paymentDate;
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


	public BigDecimal getPaymentValue() {
		return paymentValue;
	}


	public void setPaymentValue(BigDecimal paymentValue) {
		this.paymentValue = paymentValue;
	}


	public Date getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}


	public PaymentType getType() {
		return type;
	}


	public void setType(PaymentType type) {
		this.type = type;
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
		
		return java.text.MessageFormat.format("pagamento {0}", this.type);
	}
}
