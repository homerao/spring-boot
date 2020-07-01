package com.onlinelearning.web.mvc.restcontroller;

import com.onlinelearning.web.mvc.model.UserAddress;
import com.onlinelearning.web.mvc.service.Service;

public class UserAddressController extends AbstractController<UserAddress> {

	public UserAddressController(Service<UserAddress> service) {
		super(service);
		
	}

}
