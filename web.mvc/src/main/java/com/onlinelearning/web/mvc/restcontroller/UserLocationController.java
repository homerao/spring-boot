package com.onlinelearning.web.mvc.restcontroller;

import com.onlinelearning.web.mvc.model.UserLocation;
import com.onlinelearning.web.mvc.service.Service;

public class UserLocationController extends AbstractController<UserLocation> {

	public UserLocationController(Service<UserLocation> service) {
		super(service);
		
	}

}
