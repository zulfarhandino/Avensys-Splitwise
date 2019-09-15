package com.avensystraining.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avensystraining.springboot.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

}
