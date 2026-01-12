package africa.absa.ebi.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    @Bean
    public RouteLocator ebiRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(p -> p
                        .path("/ebi/customer/**")
                        .filters(f -> f.rewritePath("/ebi/customer/(?<segment>.*)", "/${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
                        .uri("lb://CUSTOMER"))
                .route(p -> p
                        .path("/ebi/accounts/**")
                        .filters(f -> f.rewritePath("/ebi/accounts/(?<segment>.*)", "/${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
                        .uri("lb://ACCOUNTS"))
                .route(p -> p
                        .path("/ebi/loans/**")
                        .filters(f -> f.rewritePath("/ebi/loans/(?<segment>.*)", "/${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
                        .uri("lb://LOANS"))
                .route(p -> p
                        .path("/ebi/cards/**")
                        .filters(f -> f.rewritePath("/ebi/cards/(?<segment>.*)", "/${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
                        .uri("lb://CARDS"))
                .route(p -> p
                        .path("/ebi/profile/**")
                        .filters(f -> f.rewritePath("/ebi/profile/(?<segment>.*)", "/${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
                        .uri("lb://PROFILE")).build();


    }

}
