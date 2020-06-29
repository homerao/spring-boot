package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.UserLocation;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/user_location")
@CrossOrigin(origins = "*")
public class UserLocationController extends AbstractController<UserLocation> {

	public UserLocationController(Service<UserLocation> service) {
		super(service);
		
	}

}
