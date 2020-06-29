package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.Payment;
import com.onlinelearning.web.mvc.service.Service;
@RestController
public class PaymentController extends AbstractController<Payment> {

	public PaymentController(Service<Payment> service) {
		super(service);
		
	}

}
