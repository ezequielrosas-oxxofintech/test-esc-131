package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@SpringBootApplication(
        scanBasePackages = ["com.demo.version", "com.example.demo"]
)
class DemoApplication {

	static void main(String[] args) {
		SpringApplication.run(DemoApplication, args)
	}

	@Controller
	static class MyController {

		@ResponseBody
		@RequestMapping("/hello")
		String hello() {
			return "hello from demo one"
		}
	}
}
