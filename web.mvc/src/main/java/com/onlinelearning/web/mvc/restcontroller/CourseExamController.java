package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseExam;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/exams")
@CrossOrigin(origins = "*")
public class CourseExamController extends AbstractController<CourseExam> {

	public CourseExamController(Service<CourseExam> service) {
		super(service);
		
	}

}
