package com.onlinelearning.web.mvc.restcontroller;

import com.onlinelearning.web.mvc.model.Category;
import com.onlinelearning.web.mvc.service.Service;

public class CategoryController extends AbstractController<Category> {

	public CategoryController(Service<Category> service) {
		super(service);
		
	}

}
