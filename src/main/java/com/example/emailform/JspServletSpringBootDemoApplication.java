package com.example.emailform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JspServletSpringBootDemoApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(JspServletSpringBootDemoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JspServletSpringBootDemoApplication.class, args);
	}

}
