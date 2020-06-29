package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseExam;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/question_alternatives")
@CrossOrigin(origins = "*")
public class CourseExamAlternativeController extends AbstractController<CourseExam> {

	public CourseExamAlternativeController(Service<CourseExam> service) {
		super(service);
		
	}

}
