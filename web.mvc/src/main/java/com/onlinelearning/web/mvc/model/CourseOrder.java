package com.onlinelearning.web.mvc.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "COURSE_ORDERS")
public class CourseOrder extends AbstractSuperClass implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name = "ORDER_ID")
	private Long orderId;
	@ManyToOne
	@JoinColumn(referencedColumnName = "USER_ID", name = "USER_ID")
	private User user;
	@Column(name = "ORDER_VALUE")
	private BigDecimal orderValue;
	@Column(name = "ORDER_STATUS")
	private OrderStatus status;
	@OneToMany(targetEntity = CourseOrderItem.class)
	private List<CourseOrderItem> itens = new ArrayList<>();
	
	public CourseOrder() {
		
	}

	public CourseOrder(User user, BigDecimal orderValue, OrderStatus status, List<CourseOrderItem> itens) {
		super();
		this.user = user;
		this.orderValue = orderValue;
		this.status = status;
		this.itens = itens;
	}
	

}
