package com.example.control;

import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.UserM;
import com.example.repo.Urepository;

@RestController
public class UController {

@Autowired
Urepository us ;

@GetMapping
public ModelAndView save(ModelAndView model) {
	model.setViewName("Home");
	return model;}

@PostMapping(path ="/login", consumes = "application/json")
	public void data (String name, String password, String email) {
	UserM ob = new UserM();
	ob.setEmail(email);
	ob.setName(name);
	ob.setPassword(password);
		us.save(ob);
	}

@GetMapping(path ="/on" , produces = "application/json")
public Iterable<UserM> prod() {
	Iterable<UserM> findAll = us.findAll();
	return findAll;
}
}
