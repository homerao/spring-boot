package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.onlinelearning.web.mvc.model.AccountRecovery;
@org.springframework.stereotype.Repository
@EnableJpaRepositories
public interface AccountRecoveryRepository
		extends CrudRepository<AccountRecovery, Long>, JpaRepository<AccountRecovery, Long> {

}
