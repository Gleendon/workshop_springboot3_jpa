package com.educancoweb.glendon.projectSpringBoot.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educancoweb.glendon.projectSpringBoot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	//recursos rest para comunicar com o front end
	
	 //metodo que responde ao tipo GET do HTTP 
	@GetMapping
	
	//ResponseEntity retorna as respostas de requisiçõe web
	public ResponseEntity<User> findAll(){
		
		//"retorno" do banco de dados
		User u = new User(1L, "Glendon", "glendonsouza@gmail.com", "9999999", "123456");
		
		//retornar com sucesso o corpo da requisição
		return ResponseEntity.ok().body(u);
	}

}
