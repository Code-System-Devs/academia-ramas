package com.academiasi.spring.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlumnoController {

	
	
	@GetMapping({"/alumnos"})
	public String alumno() {
		
		
		
	return "alumnos";	
		
		
	}
	
	
	
	
	
}
