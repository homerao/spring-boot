package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseOrderItem;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/order_itens")
@CrossOrigin(origins = "*")
public class CourseOrderItemController extends AbstractController<CourseOrderItem> {

	public CourseOrderItemController(Service<CourseOrderItem> service) {
		super(service);
		
	}

}
