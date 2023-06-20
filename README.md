# Spring Cloud Gateway
API Gateway is a design pattern that is used to provide a single point of entry for all microservices. It is a server that acts as an API front-end, routing client requests to the corresponding service.

Spring Cloud Gateway is a lightweight, yet powerful, API Gateway that is built on top of Spring Boot. It provides an easy-to-use interface to route requests to multiple services, handle cross-cutting concerns, and perform load balancing.

With Spring Cloud Gateway, you can easily configure routes using simple Java code or YAML files. It also provides a powerful filtering mechanism that enables you to modify requests and responses as they flow through the gateway.

Additionally, Spring Cloud Gateway integrates seamlessly with other Spring Cloud components, such as Service Discovery, Circuit Breaker, and Config Server.

In summary, Spring Cloud Gateway is a great tool for building a scalable and resilient microservices architecture. It simplifies the process of building and managing an API Gateway, and provides a powerful set of features that enable you to focus on building great microservices.

## **Features**

Spring Cloud Gateway features:

- Built on Spring Framework 5, Project Reactor and Spring Boot 2.0
- Able to match routes on any request attribute.
- Predicates and filters are specific to routes.
- Circuit Breaker integration.
- Spring Cloud DiscoveryClient integration
- Easy to write Predicates and Filters
- Request Rate Limiting
- Path Rewriting

## Overview
- Spring Boot 3.1.0
- Java 17
- Gradle

### Key dependencies
- Circuit Breaker
- Contract Stub Runner

## Testing
To test or mock api requests:
 ```shell
 mvn clean test
 ```

## Start Application
```shell
mvn spring-boot:run
```

Application is started at port 9090. To test sample request:
```shell
curl http://localhost:9090/get
```

To test circuit breaker (delayed response)

```shell
curl --dump-header - --header 'Host: www.circuitbreaker.com' http://localhost:9090/delay/3
```

*Happy Coding!*