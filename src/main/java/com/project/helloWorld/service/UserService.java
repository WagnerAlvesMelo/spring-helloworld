package com.project.helloWorld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.helloWorld.model.UserModel;
import com.project.helloWorld.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserModel addUser(UserModel user) {
		try{
			return userRepository.save(user);
		} catch (Exception err) {
			throw err;
		}
	}
	
	public List<UserModel> getUsers() {
		try{
			return userRepository.findAll();
		} catch (Exception err) {
			throw err;
		}
	}
}
