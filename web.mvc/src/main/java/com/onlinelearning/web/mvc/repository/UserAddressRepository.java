package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.onlinelearning.web.mvc.model.UserAddress;

@org.springframework.stereotype.Repository
@EnableJpaRepositories
public interface UserAddressRepository extends CrudRepository<UserAddress, Long>, JpaRepository<UserAddress, Long> {

}
