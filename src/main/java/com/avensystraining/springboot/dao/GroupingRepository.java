package com.avensystraining.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avensystraining.springboot.entity.Grouping;

public interface GroupingRepository extends JpaRepository<Grouping, Integer> {

}
