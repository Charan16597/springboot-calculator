package com.springboot.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorService {
	
//	@GetMapping("/calculate")
	@RequestMapping(value = "/calculate")
	public double calculate(@RequestParam String equation) {
		
		if (equation.contains("+")) {
			
			String ch = "\\+";
			
			String[] values = equation.split(ch);
			
			return Double.parseDouble(values[0]) + Double.parseDouble(values[1]);
			
		}
		else if (equation.contains("-")) {
			
			String ch = "-";
			
			String[] values = equation.split(ch);
			
			return Double.parseDouble(values[0]) - Double.parseDouble(values[1]);
			
		}
		else if (equation.contains("*")) {
			
			String ch = "\\*";
			
			String[] values = equation.split(ch);
			
			return Double.parseDouble(values[0]) * Double.parseDouble(values[1]);
			
		}
		else if (equation.contains("/")) {
			
			String ch = "/";
			
			String[] values = equation.split(ch);
			
			return Double.parseDouble(values[0]) / Double.parseDouble(values[1]);
			
		}
		
		return (double) 0.0;
		
	}

}