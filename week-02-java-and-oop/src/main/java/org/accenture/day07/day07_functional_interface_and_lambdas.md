# Functional Interface

A **functional interface** is an interface with **exactly one abstract method**. It can have:
- Only one method you must implement
- Any number of `default` or `static` methods

```java
@FunctionalInterface
public interface GreetingService {
    void greet(String message);
}
```

---
# Lambdas
A **lambda expression** is a **shorthand for implementing a functional interface**.  
It lets you pass behavior (functions) as values.

``` java
Syntax:
(parameters) -> expression

Or:
(parameters) -> {
    // multi-line code block
    return something;
}

Example:
(x) -> x * 2

Can Be Used As Predicate:
Predicate<String> isLong = s -> s.length() > 5;
System.out.println(isLong.test("hello")); // false
```

#### Use lambdas with **functional interfaces** like:

| Interface        | Description                       | Example Lambda               |
| ---------------- | --------------------------------- | ---------------------------- |
| `Predicate<T>`   | Takes T, returns boolean          | `x -> x > 0`                 |
| `Function<T, R>` | Takes T, returns R                | `x -> x.toString()`          |
| `Consumer<T>`    | Takes T, returns nothing (`void`) | `x -> System.out.println(x)` |
| `Supplier<T>`    | Takes nothing, returns T          | `() -> "hello"`              |
| `Runnable`       | Takes nothing, returns nothing    | `() -> doSomething()`        |

---

# Higher-Order Function

A **higher-order function** is a function that **either:**
1. **Takes another function as a parameter**, or
2. **Returns a function as its result**
#### Java Example: Passing a Function
```java
public static int calculate(int a, int b, MathOperation op) {
    return op.operate(a, b);
}

// Usage with a lambda
int result = calculate(5, 3, (x, y) -> x + y); // result = 8
```
#### Java Example: Returning a Function
```java
public static Function<Integer, Integer> multiplyBy(int factor) {
    return x -> x * factor;
}

Function<Integer, Integer> timesThree = multiplyBy(3);
System.out.println(timesThree.apply(10)); // 30
```
