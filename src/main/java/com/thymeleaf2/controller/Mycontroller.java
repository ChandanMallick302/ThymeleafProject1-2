package com.thymeleaf2.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Mycontroller {

	//@RequestMapping(value = "/array",method = RequestMethod.GET)
	@GetMapping("/array")
	public String Array(Model model) {
		System.out.println("inside array handler");
		String a[]= {"as","dsd","sd"};

		model.addAttribute("a", a);
		return "array";
	}
	
	//handling iteration
	
	@GetMapping("/example-loop")
	public String iteratorHandler(Model model) {
		//send
		
		//create list,set collecton
		List<String> of = List.of("Ankit","Rama","Shyam","Bhim");
		model.addAttribute("a",of);
		
		return "iterate";
	}
	
}
