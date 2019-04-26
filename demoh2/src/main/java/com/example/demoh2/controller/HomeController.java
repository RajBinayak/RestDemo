package com.example.demoh2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoh2.model.OrderUser;
import com.example.demoh2.repository.JpaRepo;

@RestController
@RequestMapping("/h2")
public class HomeController {

	@Autowired JpaRepo jpaRepo;
	//@Autowired JpaItemRepo jpaItemRepo;
	
	@PostMapping("/order")
	public OrderUser create(@RequestBody OrderUser order)
	{
		//jpaItemRepo.save(item);
		jpaRepo.save(order);
		return order;
	}
	@GetMapping("/order")
	public List<OrderUser> view()
	{
		return jpaRepo.findAll();
	}


	
}
