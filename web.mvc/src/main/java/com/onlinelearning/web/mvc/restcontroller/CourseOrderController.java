package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseOrder;
import com.onlinelearning.web.mvc.service.Service;
@RestController
public class CourseOrderController extends AbstractController<CourseOrder> {

	public CourseOrderController(Service<CourseOrder> service) {
		super(service);
		
	}

}
