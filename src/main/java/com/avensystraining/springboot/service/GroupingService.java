package com.avensystraining.springboot.service;

import java.util.List;

import com.avensystraining.springboot.entity.Grouping;

public interface GroupingService {
	
	public List<Grouping> findAll();
	
	public Grouping findById(int id);
	
	public void save(Grouping grouping);
	
	public void delete(int id);

}
