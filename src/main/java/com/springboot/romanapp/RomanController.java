package com.springboot.romanapp;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/roman")
public class RomanController {
	
	private RomanNbr N;
	
	@RequestMapping(method = RequestMethod.GET)
	public String romanNbr(@RequestParam int nbr) {
		  N = new RomanNbr(nbr);
		return N.toString();
		
	}
	
	

}
