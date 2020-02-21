package com.shoppingportal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingportal.model.AddressBean;
import com.shoppingportal.model.UserBean;
import com.shoppingportal.model.YCartBean;
import com.shoppingportal.service.ProductService;
import com.shoppingportal.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService us;

	@Autowired
	ProductService ps;

	@GetMapping
	public ModelAndView start(ModelAndView model) {
		model.setViewName("LoginPage");
		// us.data();
		// ps.data();
		return model;
	}

//---------------------------------------------USER--------------------------------------------------

//	@PostMapping("/login")
//	public ModelAndView security(String name, String password, ModelAndView model, HttpSession session) {
//		model = us.login(name, password, model, session);
//		return model;
//	}

//	@GetMapping("/logout")
//	public ModelAndView logout(ModelAndView model) {
//		model = us.logout(model);
//		return model;
//	}

	@GetMapping("/register")
	public ModelAndView register(ModelAndView model) {
		model.setViewName("RegisterPage");
		return model;
	}

	@PostMapping("/register")
	public ModelAndView register(UserBean ub, ModelAndView model) {
		model = us.register(ub, model);
		return model;
	}

	@GetMapping("/dashboard")
	public ModelAndView dashboard(ModelAndView model) {
		model = us.dashboard(model);
		return model;
	}

	@GetMapping("/profile")
	public ModelAndView profile(ModelAndView model, UserBean ub) {
		model = us.profile(ub, model);
		return model;
	}

	@GetMapping("editprofile")
	public ModelAndView editprofile(ModelAndView model) {
		model = us.editprofile(model);
		return model;
	}

	@GetMapping("/orders")
	public ModelAndView orders(ModelAndView model) {
		model = us.orders(model);
		return model;
	}

	@PostMapping("/addtocart")
	public ModelAndView addtocart(ModelAndView model, YCartBean cart) {
		model = us.addtocart(model, cart);
		return model;
	}

	@GetMapping("/yourcart")
	public ModelAndView yourcart(ModelAndView model) {
		model = us.yourcart(model);
		return model;
	}

	@PostMapping("/pay")
	public ModelAndView pay(ModelAndView model, String address, String newaddress, Integer total) {
		model = us.pay(model, address, newaddress, total);
		return model;
	}

}
