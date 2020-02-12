package com.serv.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.mod.ERepository;
import com.bean.mod.Employees;

@Service
public class LServices {
	@Autowired
	ERepository employee;
	
	
	
}
