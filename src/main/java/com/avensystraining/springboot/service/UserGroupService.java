package com.avensystraining.springboot.service;

import java.util.List;

import com.avensystraining.springboot.entity.UserGroup;

public interface UserGroupService {
	
	public List<UserGroup> findAll();
	
	public UserGroup findById(int id);
	
	public void save(UserGroup userGroup);
	
	public void delete(int id);

}
