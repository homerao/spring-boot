package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.onlinelearning.web.mvc.model.CourseMedia;

public interface CourseMediaRepository extends CrudRepository<CourseMedia, Long>, JpaRepository<CourseMedia, Long> {

}
