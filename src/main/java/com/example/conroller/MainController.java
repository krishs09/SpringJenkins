package com.example.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/hello")
	public String welcome() {
		return "Welcome";
	}
}
