package com.web.com.web.app;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webController {
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello ddWorldrdd vesion2s bakssaklımdddd bundan sonra";
	}

}
