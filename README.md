# FinanceTracker-Java-Gateway
Gateway microservice for the Java FinanceTracker big data Spring Boot application.

The API gateway microservice for the FinanceTracker Java application. The gateway connects to all the microservices (Auth and TransactionBatch)
via their routes from a RestController in that microservice. The gateway is configured using Zuul for the proxy server and 
Eureka Server/Client acting as a client for the Eureka server. The gateway also allows authentication of a user when a user
attempts to access any of the microservice routes.
