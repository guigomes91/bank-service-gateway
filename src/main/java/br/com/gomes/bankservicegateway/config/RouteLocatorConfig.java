package br.com.gomes.bankservicegateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RouteLocatorConfig {
    @Bean
    public RouteLocator customRouterLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("BANK-CONTA", r -> r.path("/api/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://bank-conta:8080"))
                .route("BANK-CONTA", r -> r.path("/api/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://bank-conta:8081"))
                .build();
    }
}
