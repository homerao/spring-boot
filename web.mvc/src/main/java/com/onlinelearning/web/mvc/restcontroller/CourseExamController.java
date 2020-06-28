package com.onlinelearning.web.mvc.restcontroller;

import com.onlinelearning.web.mvc.model.CourseExam;
import com.onlinelearning.web.mvc.service.Service;

public class CourseExamController extends AbstractController<CourseExam> {

	public CourseExamController(Service<CourseExam> service) {
		super(service);
		
	}

}
