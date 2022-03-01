package com.project.UserDataManager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.UserDataManager.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByName(String name);
}
