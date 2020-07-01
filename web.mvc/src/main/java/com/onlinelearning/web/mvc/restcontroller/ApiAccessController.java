package com.onlinelearning.web.mvc.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinelearning.web.mvc.model.ApiAccess;
import com.onlinelearning.web.mvc.service.ApiAccessService;
import com.onlinelearning.web.mvc.service.Service;
@RestController
public class ApiAccessController extends AbstractController<ApiAccess> {

	private final ApiAccessService service;
	@Autowired
	public ApiAccessController(Service<ApiAccess> service) {
		super(service);
	 this.service = (ApiAccessService) service;
	}
    @GetMapping(path = "/api/v1/apiaccess/{apiAccessId}")
	public ResponseEntity<ApiAccess> getOne(@PathVariable(name = "apiAccessId") Long id){
		ApiAccess acess = service.findOne(id);
		return ResponseEntity.status(HttpStatus.OK).body(acess);
	}
    
    @GetMapping(path = "/api/v1/apiaccess")
   	public ResponseEntity<List<ApiAccess>> getAll(){
   		List<ApiAccess> acess = service.findAll();
   		return ResponseEntity.status(HttpStatus.OK).body(acess);
   	}
}
