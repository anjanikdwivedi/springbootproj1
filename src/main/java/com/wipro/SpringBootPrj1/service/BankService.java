package com.wipro.SpringBootPrj1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.SpringBootPrj1.Employee;
import com.wipro.SpringBootPrj1.repo.BankRepository;

@Service
public class BankService {
	
	@Autowired
	BankRepository bankRepository;
	public Employee saveEmp(Employee emp)
	{
		return bankRepository.save(emp);
	}
	public List<Employee> getAllEmp() {
		List<Employee> emplist= new ArrayList<Employee>();
		
		bankRepository.findAll().forEach(emplist :: add);
		return emplist;
	}
	
	public Employee getOneEmp(String empid) {
	// TODO Auto-generated method stub
	 return bankRepository.findById(empid).get();
	}
}
