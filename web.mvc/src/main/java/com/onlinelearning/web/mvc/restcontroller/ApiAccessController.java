package com.onlinelearning.web.mvc.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.ApiAccess;
import com.onlinelearning.web.mvc.service.ApiAccessService;
@RestController
@RequestMapping(path = "/api/v1/api_access")
@CrossOrigin(origins = "*")
public class ApiAccessController extends AbstractController<ApiAccess> {

	private final ApiAccessService apiservice;
	@Autowired
	public ApiAccessController(ApiAccessService service) {

		super(service);
		this.apiservice =  service;
	}
	@GetMapping(params = "{apiAccessId}")
	public ResponseEntity<ApiAccess> getOne(@PathVariable(name = "apiAccessId") Long apiId){
		ApiAccess api =  service.findOne(apiId);
		return ResponseEntity.status(HttpStatus.OK).body(api);
	}

}
