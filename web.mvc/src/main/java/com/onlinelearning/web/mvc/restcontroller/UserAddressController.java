package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.UserAddress;
import com.onlinelearning.web.mvc.service.Service;
@RestController
public class UserAddressController extends AbstractController<UserAddress> {

	public UserAddressController(Service<UserAddress> service) {
		super(service);
		
	}

}
