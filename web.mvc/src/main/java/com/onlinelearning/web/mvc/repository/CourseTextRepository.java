package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.onlinelearning.web.mvc.model.CourseText;

public interface CourseTextRepository extends CrudRepository<CourseText, Long>, JpaRepository<CourseText, Long> {

}
