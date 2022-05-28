package com.example.devoir.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;


import com.example.devoir.models.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

	 @Query(" select u from User u " +
	            " where u.username = ?1")
	    Optional<User> findUserWithName(String username);
}
