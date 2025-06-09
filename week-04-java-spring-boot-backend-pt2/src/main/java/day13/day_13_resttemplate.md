# Learning Guide 
We will create a new application and create a simple system. We are going to make our microservices communicate — specifically using our `day12` application that exposes an API that produces a list of greetings. Complete the TODO in this project to complete the application.

#### Topics Covered:
- **RestTemplate** – Spring class used to make HTTP requests in Java
- **Streams & Collectors** – re-visit `Streams` and practice using `Collectors`
- Higher-Order Function with <K, V>

---
# RestTemplate
`RestTemplate` is a Spring class used to **make HTTP requests** in Java. It lets your app **call external APIs**, send data, and receive JSON, XML, etc.

```
RestTemplate restTemplate = new RestTemplate();

// getForEntity(...) → calls an API (GET)
ResponseEntity<MyDTO[]> response = restTemplate.getForEntity( 
    "https://api.example.com/data",
    MyDTO[].class // tells Spring how to map the response
);

MyDTO[] data = response.getBody(); // get actual data
```

### Common methods:
- `getForEntity()` → GET + full response
- `getForObject()` → GET + just body
- `postForObject()` → POST request
- `exchange()` → advanced control (headers, method, etc.)

---
# Streams & Collectors
In Java Streams, a **`Collector`** defines how to **gather the elements of a stream** into a final result — such as a `List`, `Set`, `Map`, count, or something custom.
#### Common Collectors from `Collectors` utility class:
`Collectors.toList()`
	Collects all stream elements into a `List<T>`.
```java
List<String> names = stream.collect(Collectors.toList());
```

 `Collectors.toSet()`
	Collects elements into a `Set<T>` — removes duplicates automatically.
```java
Set<String> uniqueNames = stream.collect(Collectors.toSet());
```

`Collectors.counting()`
	Counts the number of items in the stream — returns a `Long`.
```java
long count = stream.collect(Collectors.counting());
```

`Collectors.mapping()`
	Transforms each item before collecting (used _with_ another collector like `toList()` or `toSet()`).
```java
List<String> names = stream.collect(
    Collectors.mapping(Person::getName, Collectors.toList())
);
```

`Collectors.groupingBy()`
	Groups items by a field — returns a `Map<Key, List<Value>>` by default.
```java
Map<String, List<Person>> peopleByCity =
    stream.collect(Collectors.groupingBy(Person::getCity));
```

Can also be combined with `mapping()` or `counting()`:

```java
Map<String, Long> countByCity =
    stream.collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));
```

|Collector|What it does|
|---|---|
|`toList()`|Collects items into a `List`|
|`toSet()`|Collects into a `Set` (no duplicates)|
|`counting()`|Returns a count (`Long`)|
|`mapping(f, c)`|Maps values before collecting|
|`groupingBy(f)`|Groups by key into a `Map`|

---

# Higher-Order Function with `<K, V>`
A **higher-order function** is a method that:
- **Takes another function as a parameter** (like a `Function` or `Collector`)
- **Is generic**, using type parameters like `<K, V>` to work with **any key and value types**

```java
private <K, V> Map<K, V> groupGreetings(
    Function<GreetingClientResponseDTO, K> classifier,
    Collector<GreetingClientResponseDTO, ?, V> collector
)
```

Explanation:
- `<K, V>` = type parameters:
    - `K` → the key type (e.g. `String` for region)
    - `V` → the collected value type (e.g. `List<Greeting>`, `Long`, `Set<String>`)
- `Function` = how to extract the key (e.g. `getRegion`, `getType`)
- `Collector` = how to collect the values (e.g. `toList()`, `counting()`)

---

