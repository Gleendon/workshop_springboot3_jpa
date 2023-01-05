package com.educancoweb.glendon.projectSpringBoot.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educancoweb.glendon.projectSpringBoot.entities.OrderItem;

/*
 * camada responsável por acessar as informações no banco de dados
 * implementando as princiapis operações de acesso ao BD
 * JPA possui uma implementação padrão não precisa instanciar a interface
 */

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
