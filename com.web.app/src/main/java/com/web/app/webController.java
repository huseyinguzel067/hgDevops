package com.web.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webController {
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello world vesion2 bakaklım bundan sonra";
	}

}
