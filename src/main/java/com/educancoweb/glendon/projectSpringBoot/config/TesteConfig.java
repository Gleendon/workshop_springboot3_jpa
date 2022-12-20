package com.educancoweb.glendon.projectSpringBoot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educancoweb.glendon.projectSpringBoot.entities.Order;
import com.educancoweb.glendon.projectSpringBoot.entities.User;
import com.educancoweb.glendon.projectSpringBoot.entities.enums.OrderStatus;
import com.educancoweb.glendon.projectSpringBoot.repositeries.OrderRepository;
import com.educancoweb.glendon.projectSpringBoot.repositeries.UserRepository;

/* Classe de configuração para o perfil teste
 * seta configurações específica para o perfil
 * 
 */
@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	/* A dependencia desta classe deve ser fraca
	 * Utilizando a injeção de dependência do Sptrig
	 */
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository	orderRepository;

	/* Implementando o CommandLine esta classe será executada
	 * quando o programa for iniciado
	 */
	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");		
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
	
	
	
}