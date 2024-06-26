package com.mednet.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mednet.model.Employee;

public interface  EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	public Optional<Employee> findByloginIdAndPassword(String loginId, String password);

}
