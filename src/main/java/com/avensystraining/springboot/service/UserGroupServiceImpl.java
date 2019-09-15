package com.avensystraining.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avensystraining.springboot.dao.UserGroupRepository;
import com.avensystraining.springboot.entity.UserGroup;

@Service
public class UserGroupServiceImpl implements UserGroupService {

	private UserGroupRepository userGroupRepository;
	
	@Autowired
	public UserGroupServiceImpl(UserGroupRepository userGroupRepository) {
		this.userGroupRepository = userGroupRepository;
	}
	
	@Override
	@Transactional
	public List<UserGroup> findAll() {
		return userGroupRepository.findAll();
	}

	@Override
	@Transactional
	public UserGroup findById(int id) {
		// TODO Auto-generated method stub
		Optional<UserGroup> result = userGroupRepository.findById(id);
		UserGroup userGroup = null;
		
		if(result.isPresent()) {
			userGroup = result.get();
		}
		else {
			throw new RuntimeException("UserGroup id: " + id + " not found.");
		}
		return userGroup;
	}

	@Override
	@Transactional
	public void save(UserGroup userGroup) {
		userGroupRepository.save(userGroup);
	}

	@Override
	@Transactional
	public void delete(int id) {
		userGroupRepository.deleteById(id);
	}
	
}
