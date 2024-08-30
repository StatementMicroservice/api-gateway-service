package com.cbl.statement.gateway.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "gateway-service")
public class AppConfigProperty {
    private String serverPort;
    private String activeProfile;
    private ServiceRoutes serviceRoutes;

    @Data
    public static class ServiceRoutes {
        private String cityStatementAuthServiceApplicationName;
        private String cityStatementAuthServiceBaseUri;
        private String cityStatementAuthServicePath;
        private String cityStatementAuthServiceRouteId;

        private String cityStatementAppAccountServiceApplicationName;
        private String cityStatementAppAccountServiceBaseUri;
        private String cityStatementAppAccountServicePath;
        private String cityStatementAppAccountServiceRouteId;

        private String cityStatementAppCardServiceApplicationName;
        private String cityStatementAppCardServiceBaseUri;
        private String cityStatementAppCardServicePath;
        private String cityStatementAppCardServiceRouteId;

        private String cityStatementNotificationAccountServiceApplicationName;
        private String cityStatementNotificationAccountServiceBaseUri;
        private String cityStatementNotificationAccountServicePath;
        private String cityStatementNotificationAccountServiceRouteId;

        private String cityStatementNotificationCardServiceApplicationName;
        private String cityStatementNotificationCardServiceBaseUri;
        private String cityStatementNotificationCardServicePath;
        private String cityStatementNotificationCardServiceRouteId;

        private String cityStatementReportServiceApplicationName;
        private String cityStatementReportServiceBaseUri;
        private String cityStatementReportServicePath;
        private String cityStatementReportServiceRouteId;
    }


}
