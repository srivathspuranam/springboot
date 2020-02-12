package com.shoppingportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shoppingcart.DAO.UserRepository;
import com.shoppingportal.model.UserBean;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository ur;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserBean user = ur.findByName(username);
		UserDetailsImpl userDetailsImpl = new UserDetailsImpl(user);
		System.out.println(user);
		return userDetailsImpl;
	}

}
