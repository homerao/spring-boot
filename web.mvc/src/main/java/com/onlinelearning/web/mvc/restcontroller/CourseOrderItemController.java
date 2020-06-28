package com.onlinelearning.web.mvc.restcontroller;

import com.onlinelearning.web.mvc.model.CourseOrderItem;
import com.onlinelearning.web.mvc.service.Service;

public class CourseOrderItemController extends AbstractController<CourseOrderItem> {

	public CourseOrderItemController(Service<CourseOrderItem> service) {
		super(service);
		
	}

}
