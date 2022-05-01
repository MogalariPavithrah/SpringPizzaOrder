package com.abc.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.pizza.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, String>
{

	String verifyUser(String username, String password);

	boolean verifyEntries(String username, String password);

	boolean verifyEntries(String username);

	
	
}