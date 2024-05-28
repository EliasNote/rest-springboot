package com.esand.restspringboot.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("RESTful API with Java 21 and Spring Boot 3")
                                .description("API para fins de aprendizado do Spring Boot 3")
                                .version("v1")
                                .contact(new Contact().name("Elias Mathias Sand").email("elias.sand.pb@compasso.com.br"))
                );
    }
}
