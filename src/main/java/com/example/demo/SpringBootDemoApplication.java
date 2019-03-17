package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
//@Controller //AdditionalAnnotation to make this call serve requests.
public class SpringBootDemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringBootDemoApplication.class);
	
	public static void main(String[] args) {
		logger.info("[START]");
		System.out.println("[SpringBootDemoApplication.main][START]");
		
		SpringApplication.run(SpringBootDemoApplication.class, args);
		
		System.out.println("[SpringBootDemoApplication.main][END]");
		logger.info("[END]");
	}
	
	/*UNCOMMENT to overridde public/inddex.html
	@RequestMapping("/")
	@ResponseBody
	public String welcome(){
		logger.info("[welcome][START]");
		logger.info("[welcome][END]");
		return "index";
	}
	*/
}
