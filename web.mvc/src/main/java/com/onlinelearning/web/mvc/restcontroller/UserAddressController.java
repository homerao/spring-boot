package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.UserAddress;
import com.onlinelearning.web.mvc.service.Service;
import com.onlinelearning.web.mvc.service.UserService;
@RestController
@RequestMapping(path = "/api/v1/useraddress")
public class UserAddressController  {

	private final UserService service;
	@Autowired
	public UserAddressController(Service service) {
		
		this.service = (UserService) service;
	}

}
