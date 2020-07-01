package com.onlinelearning.web.mvc.restcontroller;

import com.onlinelearning.web.mvc.model.Payment;
import com.onlinelearning.web.mvc.service.Service;

public class PaymentController extends AbstractController<Payment> {

	public PaymentController(Service<Payment> service) {
		super(service);
		
	}

}
