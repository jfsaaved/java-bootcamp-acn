# Learning Guide 
We will continue to build new application based on our previous Spring Boot applications.
We will also introduce new tools we can use to implement our Microservice.
#### ⭐ Topics Covered:
- **Lombok Annotations** – to reduce boilerplate code
- **SLF4J Logging** – for structured and configurable logging
- **`@PostConstruct` and `@Bean` Annotations** – for lifecycle and configuration hooks
- **MapStruct** – for clean object mapping between models and DTOs
#### 💡Project Ideas:
- Use the `day12` application as a template to create your own project using your own domain/model
- Add support for `@RequestParam` in your controller to allow users to filter results (e.g., by type or region in our example)
- Create a separate microservice that uses **`RestTemplate`** to consume the REST API of your `day12` application

---
# Lombok Annotations
Lombok is a Java library that helps reduce boilerplate code by automatically generating common methods like getters, setters, constructors, and builders using annotations.

| Annotation                 | What it does                                                                                     |
| -------------------------- | ------------------------------------------------------------------------------------------------ |
| `@Getter`                  | Generates a getter for each field                                                                |
| `@Setter`                  | Generates a setter for each field                                                                |
| `@ToString`                | Generates a `toString()` method                                                                  |
| `@EqualsAndHashCode`       | Generates `equals()` and `hashCode()` methods                                                    |
| `@NoArgsConstructor`       | Generates a no-argument constructor                                                              |
| `@AllArgsConstructor`      | Generates a constructor with all fields                                                          |
| `@RequiredArgsConstructor` | Constructor for `final` and `@NonNull` fields only                                               |
| `@Builder`                 | Adds a fluent builder pattern to your class                                                      |
| `@Data`                    | Combines `@Getter`, `@Setter`, `@ToString`, `@EqualsAndHashCode`, and `@RequiredArgsConstructor` |
| `@Slf4j`                   | Adds a logger (`private static final Logger log = LoggerFactory.getLogger(...)`)                 |
#### Example
```java
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {
    private Long id;
    private String message;
    private String language;
}
```

---
# SLF4J Logging
SLF4J is a simple logging API in Java that lets you write log messages in your code without worrying about which logging library (like Logback or Log4j) is actually used behind the scenes.

| Level   | What it represents                                 |
| ------- | -------------------------------------------------- |
| `TRACE` | Very detailed, low-level diagnostic information    |
| `DEBUG` | Information useful for developers during debugging |
| `INFO`  | General application events and business flow       |
| `WARN`  | Unexpected situations that aren't errors yet       |
| `ERROR` | Serious problems that need attention               |
| `FATAL` | Critical errors causing system shutdown (optional) |
#### Example
```java
log.info("Order processed: id={}, userId={}, total={}", orderId, userId, total);
```
#### Too much logging:
- Hurts performance
- Pollutes logs
- Makes troubleshooting harder

Log meaningful events, not every variable, method call, or huge payloads.

---
# `@PostConstruct` and `@Bean` Annotations

### `@PostConstruct`
- Runs a method **after** the bean is created and dependencies are injected.
- Used to do **setup work**, like loading data or printing something at startup.
### `@Bean`
- Used to **create and register a bean** manually in Spring.
- Put it inside a `@Configuration` class.
- Spring will manage it like any other `@Component`.

---
# MapStruct

**MapStruct** is a Java annotation-based code generator that **automatically creates mappers** for converting between objects — usually between **entities and DTOs**.

Instead of writing boilerplate like:
```java
GreetingResponseDTO dto = new GreetingResponseDTO();
dto.setGreeting(entity.getGreeting());
dto.setType(entity.getType());
```

You just define an interface:
```java
@Mapper(componentModel = "spring")
public interface GreetingMapper {
    GreetingResponseDTO toDto(Greeting greeting);
}
```

MapStruct generates the implementation (`GreetingMapperImpl.java`) **at compile time**.

---
