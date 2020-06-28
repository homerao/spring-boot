package com.onlinelearning.web.mvc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.onlinelearning.web.mvc.model.User;

@org.springframework.stereotype.Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long>, CrudRepository<User, Long> {

      public User findByCpf(String cpf);
   
		

}
