package com.daar.engine.backend.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI springPistlOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Moteur de recherche de livre ")
                        .description("API documentation for searching engine book application")
                        .version("v0.0.1"))
                .externalDocs(new ExternalDocumentation()
                        .description("WebService1 Documentation")
                        .url("https://example.com/docs"));
    }
}