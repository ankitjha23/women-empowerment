package com.wipro.womenempowerment.restrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.womenempowerment.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByEmail(String email);

}
