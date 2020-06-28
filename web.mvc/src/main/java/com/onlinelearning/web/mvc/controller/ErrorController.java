package com.onlinelearning.web.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping
public class ErrorController {

	
	public ModelAndView errorPage(){
		ModelAndView view = new ModelAndView("ErrorPage");
		return view;
	}
}
