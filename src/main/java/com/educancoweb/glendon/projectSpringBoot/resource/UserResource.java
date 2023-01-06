package com.educancoweb.glendon.projectSpringBoot.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.educancoweb.glendon.projectSpringBoot.entities.User;
import com.educancoweb.glendon.projectSpringBoot.services.UserService;

/*
 * EndPoint do User
 */

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	 private UserService service;
	
	//metodo que responde ao tipo GET do HTTP 
	@GetMapping
	//ResponseEntity retorna as respostas de requisiçõe
	public ResponseEntity<List<User>> findAll(){
		
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<User> insert(@RequestBody User obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder
		        .fromCurrentRequest().path("/{id}")
		        .buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	

}
