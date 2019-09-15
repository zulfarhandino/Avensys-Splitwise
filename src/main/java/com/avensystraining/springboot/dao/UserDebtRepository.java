package com.avensystraining.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avensystraining.springboot.entity.UserDebt;

public interface UserDebtRepository extends JpaRepository<UserDebt, Integer> {

}
