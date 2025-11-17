Simple Dependency Injection in Spring Boot

This repository demonstrates a basic implementation of Dependency Injection (DI) in Spring Boot without using any external configuration files (XML or JSON). 
All configurations are handled using Spring Boot’s annotation-based approach.

Key Concepts Used

1. @Component — to mark classes as Spring-managed components
2. @Autowired — to automatically inject required dependencies
3. @Qualifier — to resolve ambiguity between multiple implementations of the same interface
4. Interfaces — to define contracts for loosely-coupled components
5. ApplicationContext — to retrieve Spring-managed beans
6. @SpringBootApplication — to bootstrap and configure the Spring Boot application
