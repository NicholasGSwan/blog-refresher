package com.uglygrayduck.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class HomeController {
	
	@GetMapping("/")
//	@ResponseBody
	public String home() {
	    return "index";
	}
}
