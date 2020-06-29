package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseModule;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/modules")
@CrossOrigin(origins = "*")
public class CourseModuleController extends AbstractController<CourseModule> {

	public CourseModuleController(Service<CourseModule> service) {
		super(service);
		
	}

}
