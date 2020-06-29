package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.AccountRecovery;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/account_recovery")
@CrossOrigin(origins = "*")
public class AccountRecoveryController extends AbstractController<AccountRecovery> {

	private final Service<AccountRecovery> service;
	@Autowired
	public AccountRecoveryController(Service<AccountRecovery> service) {
		super(service);
		this.service = service;
	}

}
