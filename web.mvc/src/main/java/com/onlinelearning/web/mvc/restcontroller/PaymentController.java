package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.Payment;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/payments")
@CrossOrigin(origins = "*")
public class PaymentController extends AbstractController<Payment> {

	public PaymentController(Service<Payment> service) {
		super(service);
		
	}

}
