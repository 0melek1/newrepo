package java16.end_project.config;

import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Balance Management API",
                version = "1.0",
                description = "API for managing user balances",
                contact = @Contact(
                        name = "Mələk Hacıyeva",
                        email = "melek.haciyeva@example.com"
                )
        ),
        servers = @Server(
                url = "http://localhost:8081",
                description = "Development Server"
        )
)
public class SwaggerConfig {
}

