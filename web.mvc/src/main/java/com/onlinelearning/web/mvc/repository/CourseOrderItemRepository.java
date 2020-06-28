package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.onlinelearning.web.mvc.model.CourseOrderItem;

public interface CourseOrderItemRepository  extends CrudRepository<CourseOrderItem, Long>, JpaRepository<CourseOrderItem, Long>{

}
