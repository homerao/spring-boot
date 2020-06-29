package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseOrderItem;
import com.onlinelearning.web.mvc.service.Service;
@RestController
public class CourseOrderItemController extends AbstractController<CourseOrderItem> {

	public CourseOrderItemController(Service<CourseOrderItem> service) {
		super(service);
		
	}

}
