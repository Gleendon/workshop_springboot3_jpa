package com.educancoweb.glendon.projectSpringBoot.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educancoweb.glendon.projectSpringBoot.entities.Order;
import com.educancoweb.glendon.projectSpringBoot.services.OrderService;


/*
 * é a camada rest responsável por fazer a comunicação com aplicações externas
 * o controller instancia um service
 */

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	 private OrderService service;
	
	//metodo que responde ao tipo GET do HTTP 
	@GetMapping
	//ResponseEntity retorna as respostas de requisiçõe
	public ResponseEntity<List<Order>> findAll(){
		
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
