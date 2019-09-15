package com.avensystraining.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avensystraining.springboot.dao.DebtRepository;
import com.avensystraining.springboot.entity.Debt;

@Service
public class DebtServiceImpl implements DebtService {

	private DebtRepository debtRepository;

	@Autowired
	public DebtServiceImpl(DebtRepository debtRepository) {
		this.debtRepository = debtRepository;
	}

	@Override
	@Transactional
	public List<Debt> findAll() {
		return debtRepository.findAll();
	}

	@Override
	@Transactional
	public Debt findById(int id) {
		// TODO Auto-generated method stub
		Optional<Debt> result = debtRepository.findById(id);
		Debt debt = null;

		if (result.isPresent()) {
			debt = result.get();
		} else {
			throw new RuntimeException("Debt id: " + id + " not found.");
		}
		return debt;
	}

	@Override
	@Transactional
	public void save(Debt debt) {
		debtRepository.save(debt);
	}

	@Override
	@Transactional
	public void delete(int id) {
		debtRepository.deleteById(id);
	}

}
