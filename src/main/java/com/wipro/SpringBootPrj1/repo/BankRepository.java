package com.wipro.SpringBootPrj1.repo;

import org.springframework.data.repository.CrudRepository;

import com.wipro.SpringBootPrj1.Employee;

public interface BankRepository extends CrudRepository<Employee,String>{

}
