package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.onlinelearning.web.mvc.model.CourseRegistration;

public interface CourseRegistrationRepository extends CrudRepository<CourseRegistration, Long>, JpaRepository<CourseRegistration, Long>{

}
