package com.springboot.demo;

import javax.xml.ws.ResponseWrapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class MyFirstApp5Application {
	
	
	public String App1()
	{
		return "Hiiiii";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyFirstApp5Application.class, args);
	}

}
