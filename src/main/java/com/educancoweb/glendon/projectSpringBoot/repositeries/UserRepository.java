package com.educancoweb.glendon.projectSpringBoot.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educancoweb.glendon.projectSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
