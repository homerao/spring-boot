package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseText;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/course_text")
@CrossOrigin(origins = "*")
public class CourseTextController extends AbstractController<CourseText> {

	public CourseTextController(Service<CourseText> service) {
		super(service);
		
	}

}
