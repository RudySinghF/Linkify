package com.linkifiy.linkshortner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

@RequestMapping("/")
public class LinkShortnerApplication {
	public static void main(String[] args) {
		SpringApplication.run(LinkShortnerApplication.class, args);
	}
}