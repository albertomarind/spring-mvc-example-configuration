package com.ejemplospring.mvc.services;
import org.springframework.stereotype.Service;
@Service
public class HelloService {

	public HelloService() {
		System.out.println("init service");
	}
	
	public String getHello() {
		return "hello my friend";
	}
}
