package com.system.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@Configuration
@EnableSwagger2
@EnableWebMvc
@ComponentScan(basePackages = {"com.system.controller"})
public class SwaggerConfig  {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.system.controller"))
                .paths(PathSelectors.any()).build().apiInfo(apiInfo());
    }


    private ApiInfo apiInfo() {
        Contact contact = new Contact("李志伟", "http://lisboy.top", "lisboy98@163.com");
        return new ApiInfoBuilder()
                .title("商城系统")
                .description("李志伟设计")
                .contact(contact)
                .version("1.0.0")
                .build();
    }
}
