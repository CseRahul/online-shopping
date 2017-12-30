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
		mView.addObject("title","Home");
		mView.addObject("userClickedHome",true);
		return mView;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("title","About Us");
		mView.addObject("userClickedAbout",true);
		return mView;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("title","Contact Us");
		mView.addObject("userClickedContact",true);
		return mView;
	}
	
	@RequestMapping("/listProducts")
	public ModelAndView listProduct() {
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("title","Product List");
		mView.addObject("userClickedHome",true);
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
