package com.tdvehicle.website;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan("com.tdvehicle.website.mapper")
public class WebsiteApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);
	}

	/**
	 * 打包war使用
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WebsiteApplication.class);
	}
}
