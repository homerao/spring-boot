package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.onlinelearning.web.mvc.model.CourseExamAlternative;

public interface CourseExamAlternativeRepository extends CrudRepository<CourseExamAlternative, Long>, JpaRepository<CourseExamAlternative, Long> {

}
