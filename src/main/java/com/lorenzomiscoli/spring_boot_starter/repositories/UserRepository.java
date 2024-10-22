package com.lorenzomiscoli.spring_boot_starter.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.lorenzomiscoli.spring_boot_starter.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

	public Optional<User> findByUsername(String username);

}
