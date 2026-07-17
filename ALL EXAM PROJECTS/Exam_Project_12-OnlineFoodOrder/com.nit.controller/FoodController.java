package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FoodController {
	@PostMapping("/order")
	public ModelAndView order(
	        @RequestParam("customerName") String customerName,
	        @RequestParam("foodItem") String foodItem,
	        @RequestParam("price") double price,
	        @RequestParam("quantity") int quantity,
	        @RequestParam("address") String address) {

	    double total = price * quantity;

	    ModelAndView mv = new ModelAndView();

	    mv.setViewName("result");

	    mv.addObject("customerName", customerName);
	    mv.addObject("foodItem", foodItem);
	    mv.addObject("price", price);
	    mv.addObject("quantity", quantity);
	    mv.addObject("address", address);
	    mv.addObject("total", total);

	    return mv;
	}
}
