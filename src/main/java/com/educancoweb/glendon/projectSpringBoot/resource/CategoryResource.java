package com.educancoweb.glendon.projectSpringBoot.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educancoweb.glendon.projectSpringBoot.entities.Category;
import com.educancoweb.glendon.projectSpringBoot.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;

	// metodo que responde ao tipo GET do HTTP
	@GetMapping
	// ResponseEntity retorna as respostas de requisiçõe
	public ResponseEntity<List<Category>> findAll() {

		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
