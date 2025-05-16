# Day 01 - Functions, Variables, and Data Types

This guide covers the most important foundational concepts in Java: **functions (methods)**, **variables**, and **data types**. Understanding these sets you up for almost everything else you'll do in Java.

---

## 1. Variables in Java

### What is a Variable?
A variable is a **named location in memory** used to store data that your program can manipulate.

### Declaration and Initialization
```java
int age;             // Declaration
age = 25;            // Initialization
int score = 100;     // Declaration + Initialization
```

### Reassignment
```java
score = 200;  // Changing the value
```

### Final Variables (Constants)
```java
final int MAX_USERS = 100;
// MAX_USERS = 200;  // ❌ Error: cannot reassign a final variable
```

---

## 2. Java Data Types

### Primitive Data Types
| Type     | Example         | Size     | Notes                      |
|----------|------------------|----------|----------------------------|
| `byte`   | `byte b = 127;`  | 1 byte   | Small integers             |
| `short`  | `short s = 32000;`| 2 bytes |                            |
| `int`    | `int x = 100;`   | 4 bytes  | Most common whole number   |
| `long`   | `long l = 100L;` | 8 bytes  | Needs `L` suffix           |
| `float`  | `float f = 3.14f;`| 4 bytes | Use `f` suffix             |
| `double` | `double d = 3.14;`| 8 bytes | Default for decimals       |
| `boolean`| `boolean b = true;`| 1 bit | `true` or `false`         |
| `char`   | `char c = 'A';`  | 2 bytes  | A single character         |

### Reference Data Types
- `String`, Arrays (`int[]`), Objects (`MyClass obj`)
- Stored in **heap memory** and can be mutable or immutable

---

## 3. Functions (Methods) in Java

### What is a Function?
A function (called a **method** in Java) is a **block of code** that performs a specific task.

### Basic Syntax
```java
public static int add(int a) {
    return a;
}
```

### Parts of a Method:
| Part         | Example             | Description |
|--------------|---------------------|-------------|
| **Name**     | `add`               | Method identifier |
| **Parameters**| `(int a, int b)`    | Inputs to the method |
| **Body**     | `{ return a + b; }` | The logic |
| **Return Type** | `int`            | What it gives back |

---

## Pass-by-Value (Java Style)

### Primitive Type
```java
void changeValue(int x) {
    x = 100;
}
```
Original variable is **not affected**

### Reference Type (Mutable Object)
```java
void modifyArray(int[] arr) {
    arr[0] = 999;
}
```
Original array **is modified** because reference is copied but points to same object

---

## Other Key Method Concepts

### Method Overloading
```java
int add(int a, int b)
double add(double a, double b)
```
Same method name, different parameter types

### Void Return
```java
public void sayHello() {
    System.out.println("Hello!");
}
```

### Default Return Values
```java
// All paths in a non-void method must return a value
public int giveNumber() {
    return 42;
}
```

---

## Recap

- Variables hold data
- Data types define what kind of data you can store
- Functions (methods) let you reuse logic and return results
- Java uses **pass-by-value** (even for objects, the reference is copied)
- Understanding these 3 areas is crucial for everything from loops to classes and APIs
