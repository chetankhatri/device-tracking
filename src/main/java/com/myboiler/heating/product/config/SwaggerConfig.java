package com.myboiler.heating.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.myboiler.heating.product.controller"))
                .paths(regex("/api/v1/.*"))
                .build()
                .apiInfo(metaData());
    }
    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
                "MyBoiler Heating CRM REST API",
                "MyBoiler Device Properties tracking Application",
                "1.0",
                "Terms of service",
                new Contact("Chetan Khatri", "https://twitter.com/@khatri_chetan", "ckhatrimanjal@gmail.com"),
               "Private",
                "private");
        return apiInfo;
    }
}
