package com.wipro.SpringBootPrj1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wipro.SpringBootPrj1.Employee;
import com.wipro.SpringBootPrj1.service.BankService;

@Controller
public class BankController {
	
	@Autowired
	BankService bankService;
	
	@RequestMapping("/emp")
	public String bankDetails()
	{
		return "index";
	}
	
	@RequestMapping(value="/emp", method = RequestMethod.POST)
	public Employee serviceDetails(@ModelAttribute Employee emp)
	{
		return bankService.saveEmp(emp);
	}

	@RequestMapping("/emp/getemp")
	public List<Employee> getAllEmp()
	{
		return bankService.getAllEmp();
	}
	
	@RequestMapping("/emp/display/{empid}")
	public Employee getOneEmp(@PathVariable(value="empid") String id)
	{
		return bankService.getOneEmp(id);
	}
}
