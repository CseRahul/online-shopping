package com.rahul.onlinshopping_ui.controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("greeting","Welcome to spring mvc");
		return mView;
	}
	
	/*@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam( value="greeting",required =false)String greeting) {
		if(greeting==null)
			greeting="i am Null";
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("greeting",greeting);
		return mView;
	}*/
	
	/*@RequestMapping(value = "/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting) {
		if(greeting==null)
			greeting="i am Null";
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("greeting",greeting);
		return mView;
	}*/
	
	

}