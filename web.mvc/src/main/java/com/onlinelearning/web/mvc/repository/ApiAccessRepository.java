package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlinelearning.web.mvc.model.ApiAccess;

@Repository
@EnableJpaRepositories
public interface ApiAccessRepository extends CrudRepository<ApiAccess, Long>, JpaRepository<ApiAccess, Long> {

}
