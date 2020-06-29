package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseQuestion;
import com.onlinelearning.web.mvc.service.Service;
@RestController
public class CourseQuestionController extends AbstractController<CourseQuestion> {

	public CourseQuestionController(Service<CourseQuestion> service) {
		super(service);
		
	}

}
