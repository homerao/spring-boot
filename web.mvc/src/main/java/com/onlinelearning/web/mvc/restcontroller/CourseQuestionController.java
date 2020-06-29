package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseQuestion;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/questions")
@CrossOrigin(origins = "*")
public class CourseQuestionController extends AbstractController<CourseQuestion> {

	public CourseQuestionController(Service<CourseQuestion> service) {
		super(service);
		
	}

}
