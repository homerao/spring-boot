package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseMedia;
import com.onlinelearning.web.mvc.service.Service;
@RestController
public class CourseMediaController extends AbstractController<CourseMedia> {

	public CourseMediaController(Service<CourseMedia> service) {
		super(service);
		
	}

}
