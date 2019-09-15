package com.avensystraining.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avensystraining.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
