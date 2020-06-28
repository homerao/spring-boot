package com.onlinelearning.web.mvc.restcontroller;

import com.onlinelearning.web.mvc.model.CourseQuestion;
import com.onlinelearning.web.mvc.service.Service;

public class CourseQuestionController extends AbstractController<CourseQuestion> {

	public CourseQuestionController(Service<CourseQuestion> service) {
		super(service);
		
	}

}
