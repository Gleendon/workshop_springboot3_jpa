package com.educancoweb.glendon.projectSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educancoweb.glendon.projectSpringBoot.entities.User;
import com.educancoweb.glendon.projectSpringBoot.repositeries.UserRepository;


/*
 * @Service/component/repository
 * registro da clase/componente que será injetado pelo 
 * mecanismo de injeção de dependencia do Spring
 */
@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
