package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiControllerWelcome {
	   @GetMapping("/")
	    public String Welcome(){
	        return "Welcome String Boot!";
	    }  
}
