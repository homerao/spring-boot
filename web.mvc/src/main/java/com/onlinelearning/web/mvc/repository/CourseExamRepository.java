package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.onlinelearning.web.mvc.model.CourseExam;

public interface CourseExamRepository extends CrudRepository<CourseExam, Long>, JpaRepository<CourseExam, Long> {

}
