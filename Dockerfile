FROM openjdk:21-oracle AS Build

WORKDIR /app
COPY target/city-statement-api-gateway-service.jar /app/city-statement-api-gateway-service.jar
EXPOSE 8989

ENTRYPOINT ["java","-jar","/app/city-statement-api-gateway-service.jar"]
