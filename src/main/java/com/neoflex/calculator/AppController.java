package com.neoflex.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

	@GetMapping("/calculator")
	public String calculatorForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "calculator";
	}

	@PostMapping("/calculator")
	public String calculatorSubmit(@ModelAttribute Employee employee, Model model) {
		employee.calculatePay();
		model.addAttribute("employee", employee);
		return "result";
	}

}

