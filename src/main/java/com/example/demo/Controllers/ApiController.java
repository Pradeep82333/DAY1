package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	    String studentName = "Pradeep";
	    @GetMapping("/")
	    public String getName(){
	        return "Welcome "+studentName+"!";
	    }
}
