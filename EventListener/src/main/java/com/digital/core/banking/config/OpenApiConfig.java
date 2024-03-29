package com.digital.core.banking.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
@OpenAPIDefinition
@ComponentScan(basePackages = "com.digital.core.banking")
public class OpenApiConfig {

	@Bean
	public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {

		final Info info = new Info().version("1.0.0").title("Event Processing Service").version(appVersion)
				.license(new License().name("Apache 2.0"));

		final Contact contact = new Contact().name("Demo Bank").url("https://splunklog.com");
		info.setContact(contact);

		return new OpenAPI()
				.components(new Components().addSecuritySchemes("basicScheme",
						new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
				.info(info).addServersItem(new Server().url("https://app.splunklog.com"));
	}
}
