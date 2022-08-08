package com.inno.controller;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inno.model.Employee;
import com.inno.service.ServiceI;
import com.inno.service.ServiceImpl;

@RestController
public class Empcon {
	
	@Autowired
	private ServiceImpl serviceImpl;
	@PostMapping(value="/ad" ,produces = {"application/json","application/xml"})
	public ResponseEntity<String> add1(@RequestBody Employee employee){
		
		Employee add = serviceImpl.add(employee);
		
		
		if(add!=null) {
		int sid = add.getSid();
		String sname = add.getSname();
		
		String d="Created Successfully Your ID And UERNAME="+sid +"sname";
		 return new ResponseEntity<String>(d,HttpStatus.CREATED); 
		
		}
		
		String g="not created";
		
		return new ResponseEntity<String>(g,HttpStatus.BAD_REQUEST);
		
	}

}
