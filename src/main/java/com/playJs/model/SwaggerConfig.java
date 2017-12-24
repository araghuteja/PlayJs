package com.playJs.model;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
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
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.playJs.controller"))              
          .paths(PathSelectors.ant("/api/*"))    
          .build()
          .apiInfo(apiInfo());
    }
    
    private ApiInfo apiInfo() {
         return new ApiInfo(
           "PlayJs REST API", 
           "Provides Backend to PlayJs.ga", 
           "API TOS", 
           "Terms of service", 
           new Contact("RT", "www.playjs.ga", "rauar@tuta.io"), 
           "License of API", "API license URL", Collections.emptyList());
    }
}