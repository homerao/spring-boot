package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseExam;
import com.onlinelearning.web.mvc.service.Service;
@RestController
public class CourseExamController extends AbstractController<CourseExam> {

	public CourseExamController(Service<CourseExam> service) {
		super(service);
		
	}

}
