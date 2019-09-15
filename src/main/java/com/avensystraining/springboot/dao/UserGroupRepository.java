package com.avensystraining.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avensystraining.springboot.entity.UserGroup;

public interface UserGroupRepository extends JpaRepository<UserGroup, Integer> {

}
