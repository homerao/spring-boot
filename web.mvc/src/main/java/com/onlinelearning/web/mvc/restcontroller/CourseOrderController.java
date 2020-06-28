package com.onlinelearning.web.mvc.restcontroller;

import com.onlinelearning.web.mvc.model.CourseOrder;
import com.onlinelearning.web.mvc.service.Service;

public class CourseOrderController extends AbstractController<CourseOrder> {

	public CourseOrderController(Service<CourseOrder> service) {
		super(service);
		
	}

}
