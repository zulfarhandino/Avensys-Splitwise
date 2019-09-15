package com.avensystraining.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avensystraining.springboot.entity.User;
import com.avensystraining.springboot.service.DebtService;
import com.avensystraining.springboot.service.ExpenseService;
import com.avensystraining.springboot.service.GroupingService;
import com.avensystraining.springboot.service.UserDebtService;
import com.avensystraining.springboot.service.UserExpService;
import com.avensystraining.springboot.service.UserGroupService;
import com.avensystraining.springboot.service.UserService;

@RestController
@RequestMapping("/api")
public class SplitwiseController {

	private DebtService debtService;
	private ExpenseService expenseService;
	private GroupingService groupingService;
	private UserDebtService userDebtService;
	private UserExpService userExpService;
	private UserGroupService userGroupService;
	private UserService userService;

	@Autowired
	public SplitwiseController(DebtService debtService, ExpenseService expenseService, GroupingService groupingService,
			UserDebtService userDebtService, UserExpService userExpService, UserGroupService userGroupService,
			UserService userService) {
		this.debtService = debtService;
		this.expenseService = expenseService;
		this.groupingService = groupingService;
		this.userDebtService = userDebtService;
		this.userExpService = userExpService;
		this.userGroupService = userGroupService;
		this.userService = userService;
	}
	
	// Create mappings as necessary

	@GetMapping("/user")
	public List<User> findAll() {
		return userService.findAll();
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable int id) {
		User user = userService.findById(id);
		if (user == null) {
			throw new RuntimeException("User not found");
		}

		return user;
	}

	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		user.setId(0);
		userService.save(user);
		return user;
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		userService.save(user);
		return user;
	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.delete(id);
	}

}
