package com.educancoweb.glendon.projectSpringBoot.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educancoweb.glendon.projectSpringBoot.entities.Category;

/*
 * camada responsável por acessar as informações no banco de dados
 * implementando as princiapis operações de acesso ao BD
 * JPA possui uma implementação padrão não precisa instanciar a interface
 */

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
