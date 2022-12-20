package com.educancoweb.glendon.projectSpringBoot.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educancoweb.glendon.projectSpringBoot.entities.Product;
import com.educancoweb.glendon.projectSpringBoot.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService service;

	// metodo que responde ao tipo GET do HTTP
	@GetMapping
	// ResponseEntity retorna as respostas de requisiçõe
	public ResponseEntity<List<Product>> findAll() {

		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
