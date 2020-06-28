package com.onlinelearning.web.mvc.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.onlinelearning.web.mvc.model.User;
import com.onlinelearning.web.mvc.repository.UserRepository;

@Component
@Service
public class UserService implements com.onlinelearning.web.mvc.service.Service<User>{
	
	
	private final UserRepository userRepository;
	@Autowired
	public UserService(UserRepository repository) {
		this.userRepository = repository;
	}
	@Override
	public User save(User entitydto) {
	   if(entitydto.getCreatedAt() == null) {
		   entitydto.setCreatedAt(new Date());
		   entitydto.setUpdatedAt(new Date());
	   }
	    	return userRepository.save(entitydto);	
	    
		
	}
	@Override
	public User update(User entitydto) {
		entitydto.setUpdatedAt(new Date());
		userRepository.save(entitydto);
		return null;
	}
	@Override
	public void delete(User entitydto) {
		
		 userRepository.delete(entitydto);
	}
	@Override
	public User findOne(Long id) {
	 Optional<User> user =	userRepository.findById(id);
	 User u = null;
	  if(user.isPresent()) {
		  u = user.get();
	  }
		return u;
	}
	@Override
	public List<User> findAll() {
		
		return userRepository.findAll();
	}


}
