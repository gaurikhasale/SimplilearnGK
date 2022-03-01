package com.project.UserDataManager.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.UserDataManager.entities.User;
import com.project.UserDataManager.exception.UserNotFoundException;
import com.project.UserDataManager.repository.UserRepository;


@Service 
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public Iterable<User> GetAllUsers() {
		return userRepository.findAll();
	}
	
	public User GetUserByName(String name) {
		return userRepository.findByName(name);
		
	}
	
	public User GetUserById(Integer id) {
		Optional<User> foundUser = userRepository.findById(id);
		if(!foundUser.isPresent()) throw new UserNotFoundException();
		return foundUser.get();
	}
	
	public User UpdateUser(User userToUpdate) {
		return userRepository.save(userToUpdate);
	}
}
