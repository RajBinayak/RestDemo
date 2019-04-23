package com.hp.mydemo.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.hp.mydemo.model.Emp;
import com.hp.mydemo.repository.EmpRepoCrud;
import com.hp.mydemo.repository.EmpRepository;

@RestController
@RequestMapping("/mydemo")
public class EmpController {
	
	@Autowired EmpRepository empRepository;
	@Autowired EmpRepoCrud empRepoCrud;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@RequestMapping("/")
	public String index()
	{
		
		logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
      //  new SpringLoggingHelper().helpMethod();
        return "index";
	}
	
	@GetMapping("/employee")
	public List<Emp> getAllEmp()
	{
		logger.warn("This is a warn message GetMapping");
		return empRepository.findAll();
	}
	@GetMapping("/employee/{id}")
	public Optional<Emp> getAllEmp(@PathVariable("id") int id)
	{
		return empRepository.findById(id);
	}
	
	@PostMapping("/employee")
	public Emp createEmp(@RequestBody Emp emp)
	{
		return empRepository.save(emp);
	}
	@PutMapping("/employee/{id}")
	public Emp updateEmp(@PathVariable("id") int id, @RequestBody Emp empBody)
	{
		Emp emp = empRepoCrud.findById(id).orElseThrow(()-> new ResourceAccessException("not found"));
		
		emp.setName(empBody.getName());
		emp.setSalary(empBody.getSalary());
		return  empRepository.save(emp);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmp(@PathVariable("id") int id)
	{
		empRepository.deleteById(id);
		
		return "deleted";
	}
	
}
