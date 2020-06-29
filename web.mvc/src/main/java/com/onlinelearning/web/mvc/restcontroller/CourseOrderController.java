package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseOrder;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/orders")
@CrossOrigin(origins = "*")
public class CourseOrderController extends AbstractController<CourseOrder> {

	public CourseOrderController(Service<CourseOrder> service) {
		super(service);
		
	}

}
