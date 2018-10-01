package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

/*	@Value("${name}")
	private String name;
	
	@Value("${Author}")
	private String author;*/
	
   @Autowired
   private OwnerProperties ownerproperties;
	
	@RequestMapping("/hello")
	public String hello() {
		return ownerproperties.getName() + ownerproperties.getAuthor();
	}
}
