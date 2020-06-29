package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.ApiAccess;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/api_access")
@CrossOrigin(origins = "*")
public class ApiAccessController extends AbstractController<ApiAccess> {

	public ApiAccessController(Service<ApiAccess> service) {
		super(service);
		
	}

}
