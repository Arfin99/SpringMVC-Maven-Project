package com.writingLimit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.writingLimit.controller")

public class SpringAppConfig {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver v  = new InternalResourceViewResolver();
		v.setPrefix("/WEB-INF/jsp/");;
		v.setSuffix(".jsp");;
		return v;
		
	}
	

}
