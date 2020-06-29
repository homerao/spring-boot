package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseExamApplication;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/applications")
@CrossOrigin(origins = "*")
public class CourseExamApplicationController extends AbstractController<CourseExamApplication> {

	public CourseExamApplicationController(Service<CourseExamApplication> service) {
		super(service);
		
	}

}
