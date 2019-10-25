package com.example.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderHelloController2 {
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "2:"+name;
	}
}
