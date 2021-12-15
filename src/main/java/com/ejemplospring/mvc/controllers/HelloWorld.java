package com.ejemplospring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ejemplospring.mvc.services.HelloService;

@Controller
@RequestMapping("/hello")
public class HelloWorld {
	@Autowired
	private HelloService helloService;

	public HelloWorld() {
		System.out.println("init controller");
	}
	
	@RequestMapping("/hey")
	public String getHelloWorld(Model model) {
		model.addAttribute("valor",helloService.getHello());
		return "hello-world"; 
	}
}
