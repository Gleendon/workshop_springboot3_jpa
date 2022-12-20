package com.educancoweb.glendon.projectSpringBoot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educancoweb.glendon.projectSpringBoot.entities.Category;
import com.educancoweb.glendon.projectSpringBoot.repositeries.CategoryRepository;


/*
 * Service é uma camada intermediaria entre o ressource(rest) e o acesso o banco de dados (Repository)
 * O Service instacia um repository
 */

//@Service/component/repository são registro da clase/componente que será injetado pelo mecanismo de 
//injeção de dependencia do Spring
@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
