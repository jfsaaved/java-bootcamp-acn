# Day 02 - Conditionals, Expressions, and Operators

This guide covers **conditionals**, **expressions**, and **operators** in Java — from the basics to hidden behaviors and best practices.

---
## Additional Resources

### Free Resources
[What are Conditionals - how.dev](https://how.dev/answers/what-are-conditional-statements-in-programming)    
[Java Math Operators - jenkov](https://jenkov.com/tutorials/java/math-operators-and-math-class.html)    

---
## Java Expressions

### What is an Expression?
An **expression** is a piece of code that **evaluates to a value**.
### Examples:
```java
int x = 5 + 2;          // expression: 5 + 2
boolean result = x > 3; // expression: x > 3
```

Expressions can involve variables, literals, operators, method calls, etc.

---

## Java Operators

### Arithmetic Operators
```java
+   // addition
-   // subtraction
*   // multiplication
/   // division
%   // modulo (remainder)

int sum = a + b; // Addition  
int difference = a - b; // Subtraction  
int product = a * b; // Multiplication  
int quotient = a / b; // Division  
int remainder = a % b; // Modulo
```
### Relational (Comparison) Operators
```java
==  // equal to
!=  // not equal to
>   // greater than
<   // less than
>=  // greater than or equal to
<=  // less than or equal to

boolean isEqual = a == b; // Equal to  
boolean isNotEqual = a != b; // Not equal to  
boolean isGreater = a > b; // Greater than  
boolean isLess = a < b; // Less than  
boolean isGreaterOrEqual = a >= b; // Greater than or equal to  
boolean isLessOrEqual = a <= b; // Less than or equal to
```
### Logical Operators
```java
&&  // logical AND
||  // logical OR
!   // logical NOT

boolean result1 = (a > 0) && (b > 0); // Logical AND  
boolean result2 = (a > 0) || (b < 0); // Logical OR  
boolean result3 = !(a == b); // Logical NOT
```
### Assignment Operators
```java
=    // assign
+=   // add and assign
-=   // subtract and assign
*=   // multiply and assign
/=   // divide and assign
%=   // mod and assign

int x = a; // Simple assignment  
x += b; // x = x + b  
x -= b; // x = x - b  
x *= b; // x = x * b  
x /= b; // x = x / b  
x %= b; // x = x % b
```
### Unary Operators
```java
+   // unary plus
-   // unary minus
++  // increment
--  // decrement
!   // logical complement

int tickingTimeBomb = 5;  
tickingTimeBomb++; // tickingTimeBomb = 6  
tickingTimeBomb++; // tickingTimeBomb = 7
```
### Pre and Post Increment/Decrement Examples
```java
int preIncrement = ++tickingTimeBomb; // Increments first, then returns (6)  
int postIncrement = tickingTimeBomb++; // Returns first, then increments (6, then value becomes 7)  
  
int preDecrement = --tickingTimeBomb; // Decrements first, then returns  
int postDecrement = tickingTimeBomb--; // Returns first, then decrements
```

---
## 3. Java Conditionals

### If-Else Statement
```java
if (number >= 25) {
    System.out.println("More than or equal to 25.");
} else {
    System.out.println("Otherwise.");
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
String result = (number >= 25) ? "More than or equal to 25." : "Otherwise.";
```

### Switch Statement (Traditional)
```java
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Other day");
}
```

---
## Advanced

- **Short-circuiting**: `&&` and `||` skip evaluation if the result is already known.
  ```java
  if (x != 0 && 10 / x > 1) { } // avoids divide by zero
  ```

- **Assignment inside conditionals** ():
	- Can easily be confused with `==` (comparison)
	- Avoid using it when it **hurts clarity**
	
  ```java
  if ((x = 10) > 5) { } // valid, but messy
  ```

- **Use `equals()` for String comparison** vs `==`

| Comparison | Checks             | True when                                   |
| ---------- | ------------------ | ------------------------------------------- |
| `equals()` | Content            | The characters inside are the same          |
| `==`       | Reference (memory) | Both variables point to the **same object** |

---

