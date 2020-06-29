package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.CourseCertificate;
import com.onlinelearning.web.mvc.service.Service;
@RestController
@RequestMapping(path = "/api/v1/certificates")
@CrossOrigin(origins = "*")
public class CourseCertificateController extends AbstractController<CourseCertificate> {

	public CourseCertificateController(Service<CourseCertificate> service) {
		super(service);
		
	}

}
