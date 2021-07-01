package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springdoc.core.GroupedOpenApi;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-26T11:47:57.236Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public GroupedOpenApi customImplementation(){
    	return GroupedOpenApi.builder()
                .group("Fund Transfer API")
                .pathsToMatch("/v1/**")
                .build();
    }

    Info apiInfo() {
        return new Info()
            .title("EKO APIs")
            .description("Easy salary disbursal and vendor payments")
            .termsOfService("")
            .version("1.0.0")
            .contact(new Contact());
            
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
        		.addServersItem(new Server()
        				.url("http://localhost:8081")
        				.description("TEST Server"))
            .info(new Info()
                .title("EKO APIs")
                .description("Easy salary disbursal and vendor payments")
                .termsOfService("")
                .version("1.0.0")
                .license(new License()
                    .name("")
                    .url("http://unlicense.org"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("")));
    }

}
