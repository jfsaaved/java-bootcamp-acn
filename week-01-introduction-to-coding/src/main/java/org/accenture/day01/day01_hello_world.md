# Day 01 - Hello, World!

Overview of Java, IntelliJ IDEA, and Test-Driven Development

---
## Why Learn the Java Programming Language?

- Over **9 million developers** use Java worldwide.
- Massive libraries, tools, and frameworks
- Generally the top choice in **enterprise**, **banking**, **e-commerce**, and **backend systems**.
- Used by companies like **Amazon, Google, Netflix**, and most large enterprises.

---
## Navigating IntelliJ IDEA

IntelliJ is the IDE we’ll use throughout the bootcamp. Here’s what you need to know:
### Features to Keep an Eye On:
- **Project Explorer**: Browse files, folders, and source code
- **Editor Window**: Where you write your code
- **Run & Debug Buttons**: Execute your app or tests
- **Terminal Tab**: Access command line without leaving IntelliJ
- **Console:** Where you see your program's **output**, **logs**, or **test results**

---
## Java Structure: Package, Class, Main Method

```java
package org.accenture;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Breakdown:
- `package` = Folder or namespace grouping your files
- `class` = Blueprint for your code (everything in Java lives in a class)
- `public static void main()` = Special method and entry point of application

---
## Hands-On Format: Test-Driven Development (TDD)

TDD is a development process where you write tests _before_ you write the actual code.
### Benefits:
- No bloat — you write just enough to pass the test 
- Improves design — Encourages modular, testable, single-purpose functions
- Maintainability — tests act as safety nets when changing code later
- Gives confidence — you know your code works because it passes real tests

Throughout the bootcamp, you will:
1. Be given a **written failing test**
2. **Write code** to make the test pass

---
## Example: TDD Hello Function

### Test (given to you):
```java
@Test
public void shouldSayHello() {
    assertEquals("Hello, Bootcamp!", Hello.sayHello());
}
```

### You implement:
```java
public class Hello {
    public static String sayHello() {
        return "Hello, Bootcamp!";
    }
}
```

> 🎉 Once the test passes — you're done!

---
