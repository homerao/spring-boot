package com.onlinelearning.web.mvc.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@org.springframework.data.relational.core.mapping.Table
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "ORDER_ITENS")
public class CourseOrderItem  extends AbstractSuperClass implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDER_ITEM_ID")
    private Long orderItemId;
	@ManyToOne
	@JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    private CourseOrder order;
	@OneToOne
	@JoinColumn(name = "COURSE_ID", referencedColumnName = "COURSE_ID")
    private Course course;
	@Column(name = "COURSE_VALUE")
	private BigDecimal courseValue;
  
    public CourseOrderItem() {
	     
	}

	public CourseOrderItem(CourseOrder order, Course course) {
		super();
		this.order = order;
		this.course = course;
	}
    
    
}
