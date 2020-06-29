package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.ApiAccess;
import com.onlinelearning.web.mvc.service.Service;
@RestController
public class ApiAccessController extends AbstractController<ApiAccess> {

	public ApiAccessController(Service<ApiAccess> service) {
		super(service);
		
	}

}
