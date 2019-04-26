package com.itgenius.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itgenius.service.ProductsService;

@Controller
public class HomeController {

	@Autowired
	private ProductsService productsService;

	@RequestMapping(value = "/")
	public String dashboard() {
		return "dashboard";
	}

	@RequestMapping(value = "/product")
	public String productlist() {
		return "productlist";
	}

//	@RequestMapping(value = "/product")
//	public ModelAndView getAllBook() {
//		ModelAndView mav = new ModelAndView("productlist");
//		mav.addObject("books", productsService.get());
//		return mav;
//	}

}
