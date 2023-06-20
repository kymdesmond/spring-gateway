package com.example.springgateway.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UriConfiguration.class)
public class RouteConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder, UriConfiguration uriConfiguration) {
        String htttpUri = uriConfiguration.getHttpbin();
        return builder.routes()
                .route(p ->p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri(htttpUri))
                .route(p -> p
                        .host("*.circuitbreaker.com")
                        .filters(f -> f.circuitBreaker(config -> config
                                .setName("mycmd")
                                .setFallbackUri("forward:/fallback")))
                        .uri(htttpUri))
                .build();
    }
}
