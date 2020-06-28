package com.onlinelearning.web.mvc.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.Account;
import com.onlinelearning.web.mvc.service.AccountService;


@RestController
@RequestMapping(path = "/api/v1/accounts")
@CrossOrigin(origins = "*")
public class AccountController  {
    
	
	private final AccountService service;
	@Autowired
	public AccountController(AccountService service) {
		this.service = service;
	}
	
	@GetMapping()
	public ResponseEntity<List<Account>> getAllAccounts(){
		List<Account> accountList;
		accountList = service.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(accountList);
	}
	
	@GetMapping(path = "/accounts/{accountid}")
	public ResponseEntity<Account> getAllAccounts(@PathVariable(name = "accountid") Long accountId){
		Account account;
		account = service.findOne(accountId);
		return ResponseEntity.status(HttpStatus.OK).body(account);
	}


	
}
