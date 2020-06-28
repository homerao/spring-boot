package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.onlinelearning.web.mvc.model.CourseModule;


public interface CourseModuleRepository  extends CrudRepository<CourseModule, Long>, JpaRepository<CourseModule, Long>{

}
