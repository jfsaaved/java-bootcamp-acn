# Day 01 - Java Overview

Overview of Java and printing Hello, World!

---
## Additional Resources
### Free Resources
[Java Program Lifecycle - startertutorials](https://www.startertutorials.com/corejava/life-cycle-java-program.html)     
[How JVM Executes Java Code - cesarotovalero](https://www.cesarsotovalero.net/blog/how-the-jvm-executes-java-code.html)     
[Java Full Course for Beginners](https://www.youtube.com/watch?v=eIrMbAQSU34)     
[Introduction to Java by HyperSkill](https://hyperskill.org/courses/8)    
[Java Basics - w3schools](https://www.w3schools.com/java/)    
### Books
[Head First Java](https://www.amazon.co.uk/Head-First-Java-3rd-Brain-Friendly/dp/1491910771)    
[Thinking in Java](https://www.amazon.co.uk/Thinking-Java-Eckel-Bruce-February/dp/B00IBON6C6)    
[Effective Java](https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997)    
[Java: A Beginner's Guide](https://www.amazon.co.uk/Java-Beginners-Guide-Herbert-Schildt/dp/1260463559)    
[Java: The Complete Reference](https://www.amazon.co.uk/gp/product/B09JL8BMK7/ref=dbs_a_def_rwt_bibl_vppi_i2)    

---
## Why Learn the Java Programming Language?

- Over **9 million developers** use Java worldwide.
- **Huge ecosystem** — a massive collection of libraries, tools, and frameworks.
- Generally the top choice in **enterprise**, **banking**, **e-commerce**, and **backend systems**.
- Used by companies like **Amazon, Google, Netflix**, and most large enterprises.

---
## OOP = Object-Oriented Programming

> A programming style where you **organize code into objects** — like mini-programs that represent **real-world things** (e.g., a `Car`, `User`, or `Order`).

Each object has:
- **Attributes** (data) → e.g., `color`, `name`, `price`
- **Behaviors** (methods/functions) → e.g., `drive()`, `login()`, `checkout()`

**Java is an object-oriented programming language**, built around these OOP concepts.
## Classes and Objects

#### Class = The blueprint
- Defines **what** something is and **what it can do**
- Example: A `Car` class defines that cars have a color, speed, and a `drive()` method.
#### Object = A real thing created from the class
- It’s an **actual car** — like `Car myCar = new Car();`
- Each object has **its own copy of the data**, but shares the same behavior.

---
## javac (Java Compiler)
It translates your `.java` source code into `.class` bytecode, which the **JVM** can understand and execute.

---
## JVM (Java Virtual Machine)
The JVM **takes your compiled Java code (bytecode)** and **translates it into instructions your computer can understand**, then runs it. This is what allows Java to be **platform-independent** — the same Java program can run on Windows, Mac, or Linux, as long as a JVM is available.

---
## Garbage Collector (GC)
The **Garbage Collector (GC)** is a part of the JVM that **automatically removes objects from memory** when your program no longer needs them.
- You don’t need `delete` like in C or C++.
- Java’s **Garbage Collector keeps your program memory-efficient**.
- It runs **automatically in the background**.

---
## Java Life Cycle
The **Java Life Cycle** describes the **steps your code goes through** from writing it to seeing it run on the screen.

| Step       | What Happens                            | English                                                                            |
| ---------- | --------------------------------------- | ---------------------------------------------------------------------------------- |
| 1. Write   | You write code in a `.java` file        | "You type your code in a file using a text editor or IDE."                         |
| 2. Compile | `javac` turns it into `.class` bytecode | "The Java compiler translates your code into a language the computer understands." |
| 3️. Load   | ClassLoader loads `.class` into memory  | "The JVM prepares your program by loading it into memory."                         |
| 4️. Verify | Bytecode is checked for safety          | "Java double-checks your code for anything harmful or invalid."                    |
| 5. Execute | JVM runs the code using the CPU         | "The Java Virtual Machine actually runs your program, step by step."               |

---

## Compile vs Runtime Errors
|                  | When It Happens | Examples                                              |
| ---------------- | --------------- | ----------------------------------------------------- |
| **Compile-Time** | Compile Step    | Missing semicolons, type mismatch, undefined variable |
| **Runtime**      | Execute Step    | NullPointerException, OutOfMemoryException            |

---

See `src/main/java/org/accenture/day01/lessons/HelloWorld.java` for code