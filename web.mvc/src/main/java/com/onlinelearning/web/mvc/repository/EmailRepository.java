package com.onlinelearning.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlinelearning.web.mvc.model.Email;
@Repository
public interface EmailRepository extends CrudRepository<Email, Long>, JpaRepository<Email, Long> {

}
