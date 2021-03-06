package com.yiyj.register.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import voice.voice_register_client.service.RegisterSVC;

@Controller
public class RegisterController {

	@Resource
	RegisterSVC registerSVC;

	@RequestMapping(value = "/register.do")
	public ModelAndView register(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("register/register");
		return mv;
	}

	@RequestMapping(value = "/toRegister.do")
	public void register(HttpServletRequest request, String userName, String password) {
		if (userName.isEmpty() || password.isEmpty()) {
			
		}
		boolean register = registerSVC.register(userName, password);
		if (!register) {
			
		}
	}

}
