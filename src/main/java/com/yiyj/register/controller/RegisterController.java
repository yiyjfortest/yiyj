package com.yiyj.register.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	
	@RequestMapping(value="/register.do")
	public ModelAndView register(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("register/register");
		return mv;
	}
	
	@RequestMapping(value="/toRegister.do")
	public void register(HttpServletRequest request,String userName,String password) {
		
	}
}
