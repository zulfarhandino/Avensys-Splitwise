package com.avensystraining.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avensystraining.springboot.entity.UserExp;

public interface UserExpRepository extends JpaRepository<UserExp, Integer> {

}
