package com.inno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inno.Dao.repo;
import com.inno.model.Employee;

@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	private repo red;

	@Override
	public Employee add(Employee employee) {
		
		Employee save = red.save(employee);
		
		
	
		return save;
	}

	@Override
	public Employee get1(int id) {
		
		Employee employee = red.findById(id).get();
		return employee;
	}
	
	

}
