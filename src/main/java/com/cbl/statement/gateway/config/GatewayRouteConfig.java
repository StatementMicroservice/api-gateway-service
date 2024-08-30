package com.cbl.statement.gateway.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class GatewayRouteConfig {

    private final AppConfigProperty appConfigProperty;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        final AppConfigProperty.ServiceRoutes serviceRoutes = appConfigProperty.getServiceRoutes();
        log.info("Route config started::");
        return builder.routes()
                .route(serviceRoutes.getCityStatementAuthServiceRouteId()
                     , r -> r.path(serviceRoutes.getCityStatementAuthServicePath())
                             .uri(serviceRoutes.getCityStatementAuthServiceBaseUri()))
                      
                .route(serviceRoutes.getCityStatementAppAccountServiceRouteId()
                     , r -> r.path(serviceRoutes.getCityStatementAppAccountServicePath())
                             .uri(serviceRoutes.getCityStatementAppAccountServiceBaseUri()))
                      
                .route(serviceRoutes.getCityStatementAppCardServiceRouteId()
                     , r -> r.path(serviceRoutes.getCityStatementAppCardServicePath())
                             .uri(serviceRoutes.getCityStatementAppCardServiceBaseUri()))
                      
                .route(serviceRoutes.getCityStatementNotificationAccountServiceRouteId()
                     , r -> r.path(serviceRoutes.getCityStatementNotificationAccountServicePath())
                             .uri(serviceRoutes.getCityStatementNotificationAccountServiceBaseUri()))
                      
                .route(serviceRoutes.getCityStatementNotificationCardServiceRouteId()
                     , r -> r.path(serviceRoutes.getCityStatementNotificationCardServicePath())
                        .uri(serviceRoutes.getCityStatementNotificationCardServiceBaseUri()))
                      
                .route(serviceRoutes.getCityStatementReportServiceRouteId()
                     , r -> r.path(serviceRoutes.getCityStatementReportServicePath())
                             .uri(serviceRoutes.getCityStatementReportServiceBaseUri()))
                .build();
    }
}