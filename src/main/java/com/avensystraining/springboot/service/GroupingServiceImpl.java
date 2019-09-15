package com.avensystraining.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avensystraining.springboot.dao.GroupingRepository;
import com.avensystraining.springboot.entity.Grouping;

@Service
public class GroupingServiceImpl implements GroupingService {

	private GroupingRepository groupingRepository;
	
	@Autowired
	public GroupingServiceImpl(GroupingRepository groupingRepository) {
		this.groupingRepository = groupingRepository;
	}
	
	@Override
	@Transactional
	public List<Grouping> findAll() {
		return groupingRepository.findAll();
	}

	@Override
	@Transactional
	public Grouping findById(int id) {
		// TODO Auto-generated method stub
		Optional<Grouping> result = groupingRepository.findById(id);
		Grouping grouping = null;
		
		if(result.isPresent()) {
			grouping = result.get();
		}
		else {
			throw new RuntimeException("Grouping id: " + id + " not found.");
		}
		return grouping;
	}

	@Override
	@Transactional
	public void save(Grouping grouping) {
		groupingRepository.save(grouping);
	}

	@Override
	@Transactional
	public void delete(int id) {
		groupingRepository.deleteById(id);
	}
	
}
