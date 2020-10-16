package com.cn.otou.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//本应用
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
	}

}
