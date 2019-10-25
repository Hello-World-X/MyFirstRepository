package com.example.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderHelloController1 {
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "1:"+name;
	}
}
