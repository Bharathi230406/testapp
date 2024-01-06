package com.tech.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestappController {
	@GetMapping(value = "/test")
	public String test() {
		return "Hello Everyone";
	}

}
