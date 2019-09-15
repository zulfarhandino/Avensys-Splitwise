package com.avensystraining.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avensystraining.springboot.entity.Debt;

public interface DebtRepository extends JpaRepository<Debt, Integer> {

}
