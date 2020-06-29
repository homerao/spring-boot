package com.onlinelearning.web.mvc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.onlinelearning.web.mvc.model.Account;
@org.springframework.stereotype.Repository
@EnableJpaRepositories
public interface AccountRepository extends CrudRepository<Account, Long>, JpaRepository<Account, Long> {


    public Account findByEmail(String email);




}
