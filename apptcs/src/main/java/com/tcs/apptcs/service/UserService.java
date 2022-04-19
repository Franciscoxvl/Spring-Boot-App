package com.tcs.apptcs.service;

import javax.validation.Valid;

import com.tcs.apptcs.entity.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;

}
