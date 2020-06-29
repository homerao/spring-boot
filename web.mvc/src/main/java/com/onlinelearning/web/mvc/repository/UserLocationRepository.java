package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.onlinelearning.web.mvc.model.UserLocation;
@org.springframework.stereotype.Repository
@EnableJpaRepositories
public interface UserLocationRepository extends CrudRepository<UserLocation, Long>, JpaRepository<UserLocation, Long> {

}
