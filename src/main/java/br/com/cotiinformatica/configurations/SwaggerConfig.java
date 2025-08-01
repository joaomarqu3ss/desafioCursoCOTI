package br.com.cotiinformatica.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("API Supermarket")
				.description("Documentação da API desenvolvida com Spring Boot")
				.version("1.0.0")
				.contact(new Contact()
						.name("Supermarket API Team")
						.url("https://www.supermarket.com.br")
						.email("contato@supermakert.com.br")));
	}

}
