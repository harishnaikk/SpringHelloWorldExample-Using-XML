package com.harish.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "printHello")
	@ResponseBody
	public String returnHelloWorld() {
		
		String dynamicMessage = "You did it !!!";
		
		return dynamicMessage;
	}
}
