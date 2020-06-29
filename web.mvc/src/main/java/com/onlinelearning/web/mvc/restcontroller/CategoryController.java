package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.Category;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/categories")
@CrossOrigin(origins = "*")
public class CategoryController extends AbstractController<Category> {

	public CategoryController(Service<Category> service) {
		super(service);
		
	}

}
