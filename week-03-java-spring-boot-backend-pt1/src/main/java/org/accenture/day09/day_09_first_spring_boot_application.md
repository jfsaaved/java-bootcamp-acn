
# Learning Approach for a Backend Role
- Use abstraction to build fast (and fail fast)
- Learn internals later — when your app fails, or when you want to understand why things work
- Repeat through small projects/experiments
- Build on your old projects — reuse ideas, improve structure, and try new ideas
#### What Is a Backend Project?
In this context — a **project** is where you’ve:
- Created a working program / system
- Reached a clear goal — Input Data/Action → Application/System Logic → Output/Result

---   
# Identify Project
We will create a "Hello World" project using the foundational ideas we've gained the past 2 weeks
### Input
- Hit http://localhost:8080/hello on a browser
### Output
- Returns "Hello World" to browser
### Rules
- Create a `DataModel` class with fields `id` and `value`
- Set up an in-memory `HashMap` to act as a mock database
- Preload the map with one entry: `id = 0`, `value = "Hello World"` — repository constructor

---
# Learning Guide
- Spring Boot & Build Management - Define pom.xml (.gradle for Gradle)
- Main Class - @SpringBootApplication Annotation
- More Spring Boot Annotations
- Run Application

---
# Spring Boot & Build Management - pom.xml
What libraries do we need to add to use `Spring Boot`?
**Spring Boot** - A ready-to-use toolbox for making web apps and APIs in Java. It's a framework.

For a Hello World project, we identified we only need the following library.
- **`spring-boot-starter-web`** – Lets you create web APIs using **Spring MVC** (`@RestController`, `@GetMapping`, etc.). It includes an embedded web server (like **Tomcat**).

---
# Main Class - `@SpringBootApplication` Annotation
We learned `@SpringBootApplication` tells Spring Boot,
	**“Start the app here, auto-configure everything, and scan for my code.”**

It’s a shortcut for three things:
- `@Configuration` (this class has settings),
- `@EnableAutoConfiguration` (set things up for me),
- `@ComponentScan` (look for my controllers and services).

Put it on your **main class**, and Spring Boot does the rest — no extra setup needed. And we can run immediately.

```java
@SpringBootApplication  
public class Application {  
	public static void main(String[] args) {  
			SpringApplication.run(Application.class);  
		}  
}
```

---
# More Spring Boot Annotations
- **`@RestController`** – Makes a class handle **web requests** (like `/hello`).
- **`@GetMapping("/hello")`** – Runs a method when someone visits that **path**.
- **`@Service`** – Holds your app’s **main logic**.
- **`@Repository`** – Talks to the **database**.

We know how to do this intuitively from previous exercises.

---
# Hit Application
See `Hello World` by hitting `localhost:8080` with the path provided
