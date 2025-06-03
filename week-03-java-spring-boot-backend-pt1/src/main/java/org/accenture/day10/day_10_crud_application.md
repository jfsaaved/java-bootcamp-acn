
# CRUD Project
### Input
- Use the `GET`, `POST`, and `PUT` HTTP methods on: `http://localhost:8080/greetings`
### Output
- `GET` → Retrieve greeting(s) from the database
- `POST` → Create a new greeting and save it to the database
- `PUT` → Update an existing greeting in the database

---
# Topics Learning Guide
- REST Annotations
- Builder Pattern and `ResponseEntity`
- Optional
- curl, Postman, and Insomnia
- Model Validations with Spring
- Data Transfer Objects (DTOs)

---
# REST Annotations
- `@RequestMapping` —  maps a URL path to a controller **method or class** (can handle all HTTP methods unless specified). More control.
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` — are **shortcuts** for `@RequestMapping` with specific HTTP methods predefined
- `@PathVariable` — extracts a dynamic value (e.g. `{id}`) from the URL and passes it as a method parameter.
- **`@RequestBody`** — tells Spring to **convert the incoming JSON request** into a Java object and pass it to the method.

---
# Builder Pattern and `ResponseEntity`
- The **Builder Pattern** is a design pattern that helps you **create complex objects step-by-step**, especially when an object has many fields or optional parameters.
	-  Avoids **long constructors** with too many parameters
- `ResponseEntity` is a Spring class that lets you build **custom HTTP responses** with full control over:
	- **Status code** (like 200, 201, 400, 404)
	- **Response body** (JSON, string, object)
	- **Headers** (like `Location`, `Content-Type`)

---
# Optional
`Optional<T>` is a Java class that may or may not hold a value — it's a way to **avoid `null` and `NullPointerException`**. Instead of returning `null` and forcing the caller to remember to check for it, you return an `Optional<T>`, which says: "Handle this properly this might be empty."
- Makes your API more **intentional**
- Forces you to **think about missing data**
- Supports **functional-style** handling (`map()`, `orElse()`, etc.)

---
# curl, Postman, and Insomnia
- **curl** is a **command-line tool** used to send HTTP requests. It’s useful for quick tests and automation in scripts.
- **Postman** and **Insomnia** are **visual tools** (GUI) that let you test APIs by building and sending requests without writing code.
- All three let you:
    - Choose a **method** (`GET`, `POST`, etc.)
    - Set the **URL**, headers, and body
    - View the **status code** and **response**

---
# Model Validations with Spring
- **`@Valid`** — Tells Spring to validate the request body using the rules you set in the class. It comes from the `spring-boot-starter-validation` library.  
#### Common Annotations

|Annotation|Description|Example Use|
|---|---|---|
|`@NotBlank`|Field must not be null or empty (for strings)|`@NotBlank(message = "Name is required")`|
|`@NotEmpty`|Field must not be empty (for collections, strings)|`@NotEmpty(message = "List can't be empty")`|
|`@NotNull`|Field must not be null|`@NotNull(message = "ID is required")`|
|`@Email`|Field must be a valid email format|`@Email(message = "Invalid email")`|
|`@Size`|Checks length/size of string or collection|`@Size(min = 3, max = 10)`|
|`@Min` / `@Max`|Min/max numeric value|`@Min(18)` or `@Max(100)`|
|`@Pattern`|Regex validation for string|`@Pattern(regexp = "^[a-zA-Z]+$")`|

---
# Data Transfer Object (DTOs)
A **DTO (Data Transfer Object)** is a simple Java class used to **transfer data between layers** of an application.
- Keeps internal models (like database entities) **separate** from external data
- Prevents **overexposing** sensitive fields (e.g., passwords, IDs)
- Allows **custom validation**, formatting, and input shaping
- Maintainability & readability

---


