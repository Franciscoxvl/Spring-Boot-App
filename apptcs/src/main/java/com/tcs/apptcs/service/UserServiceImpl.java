package com.tcs.apptcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.apptcs.entity.User;
import com.tcs.apptcs.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository repository;
	
	@Override
	public Iterable<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}