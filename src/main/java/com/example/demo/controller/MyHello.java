package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyHello {
	private final Logger logger = LoggerFactory.getLogger(MyHello.class);
	
	@RequestMapping(path="/hello/{nm}"
						, method=RequestMethod.GET
						//, consumes= MediaType.TEXT_PLAIN_VALUE
						, produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> sayHello(@PathVariable(name="nm") String name){
		logger.info("[START]");
		System.out.println("[sayHello][START]");
		
		String greet = "<h1>Hello %s !!</h1>";
		
		System.out.println("[sayHello][END]");
		logger.info("[END]["+String.format(greet, name)+"]");		
		return new ResponseEntity<String>(String.format(greet, name), HttpStatus.OK);
	}
}
