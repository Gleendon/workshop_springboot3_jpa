package com.educancoweb.glendon.projectSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educancoweb.glendon.projectSpringBoot.entities.Order;
import com.educancoweb.glendon.projectSpringBoot.repositeries.OrderRepository;


/*
 * Service é uma camada intermediaria entre o ressource(rest) e o acesso o banco de dados (Repository)
 * O Service instacia um repository
 */

//@Service/component/repository são registro da clase/componente que será injetado pelo mecanismo de 
//injeção de dependencia do Spring
@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
