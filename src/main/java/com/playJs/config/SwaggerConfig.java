package com.playJs.config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.directModelSubstitute(LocalDateTime.class, String.class)
				.directModelSubstitute(LocalDate.class, String.class)
				.directModelSubstitute(LocalTime.class, String.class)
				.directModelSubstitute(ZonedDateTime.class, String.class)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.playJs.controller"))
				.paths(PathSelectors.regex("/api/*.*")).build().apiInfo(apiInfo());
	}

	@SuppressWarnings("rawtypes")
	private ApiInfo apiInfo() {
		return new ApiInfo("PlayJs REST API", "Provides Backend to PlayJs.ga", "V 1.0", "Terms of service",
				new Contact("RT", "www.playjs.ga", "rauar@tuta.io"), "License of API", "API license URL",
				new ArrayList<VendorExtension>());
	}
}