# Day 02 - Conditionals, Expressions, and Operators

This guide covers **conditionals**, **expressions**, and **operators** in Java — from the basics to hidden behaviors and best practices.

---
## Additional Resources

### Free Resources
[What are Conditionals - how.dev](https://how.dev/answers/what-are-conditional-statements-in-programming)    
[Java Math Operators - jenkov](https://jenkov.com/tutorials/java/math-operators-and-math-class.html)    

---
## 1. Java Expressions

### What is an Expression?
An **expression** is a piece of code that **evaluates to a value**.

### Examples:
```java
int x = 5 + 2;          // expression: 5 + 2
boolean result = x > 3; // expression: x > 3
```

Expressions can involve variables, literals, operators, method calls, etc.

---

## ➕ 2. Java Operators

Java has several categories of operators:

### Arithmetic Operators
```java
+   // addition
-   // subtraction
*   // multiplication
/   // division
%   // modulo (remainder)
```

### Relational (Comparison) Operators
```java
==  // equal to
!=  // not equal to
>   // greater than
<   // less than
>=  // greater than or equal to
<=  // less than or equal to
```

### Logical Operators
```java
&&  // logical AND
||  // logical OR
!   // logical NOT
```

### Assignment Operators
```java
=    // assign
+=   // add and assign
-=   // subtract and assign
*=   // multiply and assign
/=   // divide and assign
%=   // mod and assign
```

### Unary Operators
```java
+   // unary plus
-   // unary minus
++  // increment
--  // decrement
!   // logical complement
```

### Bitwise Operators (rare but powerful)
```java
&   // bitwise AND
|   // bitwise OR
^   // bitwise XOR
~   // bitwise complement
<<  // left shift
>>  // right shift
>>> // unsigned right shift
```

---

## Operator Precedence & Associativity

### Precedence (from high to low):
1. `()` – Parentheses
2. `++`, `--`, `!` – Unary
3. `*`, `/`, `%`
4. `+`, `-`
5. `<`, `>`, `<=`, `>=`
6. `==`, `!=`
7. `&&`
8. `||`
9. `=`, `+=`, `-=`, etc.

### Associativity:
- Left-to-right for most operators
- Right-to-left for assignments (`=`, `+=`, etc.)

---

## 3. Java Conditionals

### If-Else Statement
```java
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

### Else-If Ladder
```java
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else {
    System.out.println("C or below");
}
```

### Ternary Operator
```java
String result = (age >= 18) ? "Adult" : "Minor";
```

### Switch Statement (Traditional)
```java
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Other day");
}
```

### Switch Expression (Java 14+)
```java
String result = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Other";
};
```

---

## Advanced

- **Short-circuiting**: `&&` and `||` skip evaluation if the result is already known.
  ```java
  if (x != 0 && 10 / x > 1) { } // avoids divide by zero
  ```

- **Bitwise Tricks**: Use `^` to toggle bits or swap values (rare in high-level code).
  ```java
  a = a ^ b; b = a ^ b; a = a ^ b; // swap a and b
  ```

- **Assignment inside conditionals** (be careful!):
  ```java
  if ((x = 10) > 5) { } // valid, but risky
  ```

- **Modulus with negatives**:
  ```java
  -5 % 3 == -2 // Java preserves the sign of the numerator
  ```

- **Use `equals()` for String comparison**, not `==`
  ```java
  "abc".equals("abc") // true
  "abc" == "abc"      // may be true (due to interning), but not reliable
  ```

---

## Summary

- Use **expressions** to compute values
- Use **operators** to compare, assign, calculate, and make decisions
- Use **conditionals** to control the flow of logic
- Understand **precedence**, **short-circuiting**, and the dangers of misusing `==` with objects

Mastering these core tools gives you power and confidence when building logic in Java!

