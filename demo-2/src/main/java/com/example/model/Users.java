package com.example.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.Urepository;

@Service
public class Users {

	
	@Autowired
	Urepository us ;
	
	private List<UserM> UserList;
	
	public List< UserM> getUserList(){
		if (UserList == null) {
			UserList = new ArrayList<>();
		}
		return UserList;
	}

}
