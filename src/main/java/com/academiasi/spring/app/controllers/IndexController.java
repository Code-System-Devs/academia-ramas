package com.academiasi.spring.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@GetMapping({ "/index", "/", "/home" })
	public String index() {
		return "index";
	}
	
	@RequestMapping({ "/maestros"})
	public String maestros() {
		return "maestros";
	}
}
