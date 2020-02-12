package com.shoppingportal.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.shoppingportal.model.TransactionBean;
import com.shoppingportal.model.UserBean;

@SuppressWarnings("serial")
public class UserDetailsImpl implements UserDetails {

	private UserBean user;

	public UserDetailsImpl(UserBean user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> grantedAuthority = new ArrayList<GrantedAuthority>();
		GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + user.getRole());
		grantedAuthority.add(authority);
		return grantedAuthority;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	public List<TransactionBean> getTransactions() {
		return user.getTransactions();
	}	

}
