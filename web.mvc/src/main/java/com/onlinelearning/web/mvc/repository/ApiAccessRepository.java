package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.onlinelearning.web.mvc.model.ApiAccess;


public interface ApiAccessRepository extends CrudRepository<ApiAccess, Long>, JpaRepository<ApiAccess, Long> {

}
