package com.foodRecipe.recipeBook.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Darren",
                        email = "darren@hotmail.com",
                        url = "http://darren.com"

                ),
                description = "OpenApi documentation",
                title = "Recipe Book",
                version = "1.0",
                license = @License(
                        name = "Licence name",
                        url = "https://licence.com"
                ),
                termsOfService = "Terms of service"
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8080"
                ),
                @Server(
                        description = "PROD ENV",
                        url = "https://proenv.com"
                )
        }
)
@Configuration
public class OpenApiConfig {

}
