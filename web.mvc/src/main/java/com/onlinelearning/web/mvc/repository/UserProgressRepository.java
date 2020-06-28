package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.onlinelearning.web.mvc.model.UserProgress;

public interface UserProgressRepository extends CrudRepository<UserProgress, Long>, JpaRepository<UserProgress, Long>{

}
