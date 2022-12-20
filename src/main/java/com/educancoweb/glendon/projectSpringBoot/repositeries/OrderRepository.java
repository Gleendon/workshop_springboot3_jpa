package com.educancoweb.glendon.projectSpringBoot.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educancoweb.glendon.projectSpringBoot.entities.Order;

/*
 * Camada responsável por acessar as informações no banco de dados
 * A JPA possui uma implementação padrão para operações no BAD
 * não precisa instanciar a interface que extende o JPARepository
 */

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
