package com.avensystraining.springboot.service;

import java.util.List;

import com.avensystraining.springboot.entity.User;

public interface UserService {
	
	public List<User> findAll();
	
	public User findById(int id);
	
	public void save(User user);
	
	public void delete(int id);

}
