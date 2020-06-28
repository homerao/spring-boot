package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.onlinelearning.web.mvc.model.Category;
import com.onlinelearning.web.mvc.model.UserProgress;

public interface CategoryRepository extends CrudRepository<Category, Long>, JpaRepository<Category, Long> {

}
