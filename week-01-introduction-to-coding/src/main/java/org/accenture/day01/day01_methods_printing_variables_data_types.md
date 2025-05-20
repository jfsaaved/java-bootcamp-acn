# Day 01 - Methods, Printing, Arithmetic Operators, Variables, and Data Types

This guide covers foundational concepts in Java: **methods**, **variables**, **printing**, **arithmetic operators**, and **data types**.

---
## Additional Resources

### Free Resources
[Java Language Basics - Official](https://dev.java/learn/language-basics/)    
[Variables - jenkov](https://jenkov.com/tutorials/java/variables.html)    
[Data Types - jenkov](https://jenkov.com/tutorials/java/data-types.html)    
[Strings & Methods - jenkov](https://jenkov.com/tutorials/java/strings.html)    
[Variable Scopes - Baeldung](https://www.baeldung.com/java-variable-scope)    
[Type Casting - simplilearn](https://www.simplilearn.com/tutorials/java-tutorial/type-casting-in-java)    

---
## 1.0 Methods
A **method** is a block of code that performs a specific task. It runs when it is **called/invoked**.

```
public static String greetUser(String name) {
	return "Hello..." + name;
} 
```

| Part                | Description                                                 | Example                       | Possible Values / Examples                                                         |
| ------------------- | ----------------------------------------------------------- | ----------------------------- | ---------------------------------------------------------------------------------- |
| **Access Modifier** | Controls visibility of the method                           | `public`                      | `public`, `private`, `protected`, _default_ (no keyword)                           |
| **Static Modifier** | Makes the method belong to the class instead of an instance | `static`                      | `static` (or leave empty for non-static methods)                                   |
| **Return Type**     | The type of data the method returns                         | `String`                      | `void`, `int`, `double`, `boolean`, `String`, custom classes, etc.                 |
| **Method Name**     | The name used to call the method                            | `greetUser`                   | Anything, but ideally with camelCase format: `add`, `printHello`, `calculateTotal` |
| **Parameters**      | Inputs the method needs, inside parentheses                 | `(String name)`               | `()`, `(int x)`, `(String a, int b)`, `(double price, int qty)`                    |
| **Method Body**     | Code that runs when method is called, inside `{}`           | `{ return "Hello " + name; }` | Any valid Java statements: `System.out.println();`, `return x + y;`                |

---
## 1.1 Methods - Invoking a Method
#### Static Method Invocation
Call the method using the class name (no object needed)

```
public class Utils {
    public static void sayHello() {
        System.out.println("Hello!");
    }
}

// Method call:
Utils.sayHello();

```

#### Instance Method Invocation
Call the method using an object of the class.

```
public class Greeter {
    public void greet(String name) {
        System.out.println("Hi " + name);
    }
}

// Method call:
Greeter greeter = new Greeter(); // create object
greeter.greet("Alice");          // call method

```

---
## 1.2 Methods - Special Methods
#### Constructor Methods
A constructor is a special method used to **create objects**.
- Same name as the class
- No return type (not even `void`)
- Runs automatically when you use `new`

```
public class Person {
    String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }
}
```
#### `main` Method
The entry point of any Java application. It’s the first method that runs.

```
public static void main(String[] args) {
	// Code goes here
}
```

---

## 2.0 Variables and Data Types
In Java, a **variable** is a named space in memory used to **store data**.  
Each variable must be declared with a **data type**, which tells the compiler what kind of data it holds.

```
int age = 25;
String name = "Alice";
```

#### Local Variables
- Declared inside a method or block
- Stored on the **stack**
- Cannot be accessed outside their method
- Must be **initialized before use**
- **Not** accessible by other methods

```
public void greet() {
    String name = "Alice"; // local variable
    System.out.println("Hello, " + name);
}
```

#### Instance Variable
- Belongs to an **object**
- Each object gets its own copy

```
public class Person {
    String name; // instance variable

    public void greet() {
        System.out.println("Hello, " + name);
    }
}
```

#### Class Variable (Static)
- Shared across **all objects**
- Belongs to the **class**, not the object

```
public class Counter {
    static int count = 0; // class-level (static) variable

    public Counter() {
        count++;
    }
}
```

#### Additional Information: `final` keyword
You can assign it only once. After that, its value cannot be changed. Can be used for methods and classes too. 

| Use          | What it Means                                                                                                       | Example                   |
| ------------ | ------------------------------------------------------------------------------------------------------------------- | ------------------------- |
| **Variable** | You can assign a value only once; it cannot be changed                                                              | `final int x = 5;`        |
| **Method**   | This method cannot be changed by other classes                                                                      | `public final void run()` |
| **Class**    | “This class is **complete**. No one should build on top of it.”  <br>This is useful for **utility/helper classes**. | `final class Utils {}`    |

---
## 2.1 Variables and Data Types - Categories of Data Types

#### Primitive Data Types
These are **basic, built-in types** that store actual values.  Stored directly in the **stack memory**.

| Type      | Size   | Description                      | Example                   | Limitations                                                               |
| --------- | ------ | -------------------------------- | ------------------------- | ------------------------------------------------------------------------- |
| `byte`    | 8-bit  | Very small whole numbers         | `byte b = 100;`           | Range: -128 to 127                                                        |
| `short`   | 16-bit | Small whole numbers              | `short s = 32000;`        | Range: -32,768 to 32,767                                                  |
| `int`     | 32-bit | Standard whole numbers           | `int x = 42;`             | Range: -2,147,483,648 to 2,147,483,647                                    |
| `long`    | 64-bit | Large whole numbers              | `long l = 123456789L;`    | Must end with `L`; large values consume more memory                       |
| `float`   | 32-bit | Decimal numbers (less precision) | `float f = 3.14f;`        | Precision limited to ~6–7 decimal digits; must end with `f`               |
| `double`  | 64-bit | High-precision decimal numbers   | `double pi = 3.14159;`    | Precision limited to ~15 decimal digits; slightly slower than `float`     |
| `char`    | 16-bit | A single character (Unicode)     | `char c = 'A';`           | Only one character; must use single quotes `' '`                          |
| `boolean` | 1-bit  | `true` or `false`                | `boolean isValid = true;` | Only two values; no numeric representation (not `0` or `1` like in C/C++) |
#### Reference (Non-Primitive) Data Types
These **refer to objects** and are stored in **heap memory**. The variable holds a **reference** (pointer) to the actual data. Some examples:

| Type            | Description                        | Example                                                    |
| --------------- | ---------------------------------- | ---------------------------------------------------------- |
| `String`        | A sequence of characters           | `String s = "Hello";`                                      |
| Classes         | Custom types you define            | `Person p = new Person();`                                 |
| Wrapper Classes | Object versions of primitive types | `Integer x = Integer.valueOf(5);`<br>`Boolean flag = true` |

---
## 2.2 Variables and Data Types - Stack vs Heap Memory

#### Stack Memory
- Used for **method calls** and **local variables**
- Cleared automatically when the method ends
#### Heap Memory
- Used for **objects**
- Lives as long as the object is still being used
- Managed by Java’s **Garbage Collector**

|Line|What’s on Stack|What’s on Heap|
|---|---|---|
|`int x = 10;`|`x = 10`|–|
|`String s = "Hello";`|`s → "Hello"` (reference)|`"Hello"` in string pool|
|`Person p = new Person()`|`p →` (points to object)|`Person{name="Ana"}`

---

## 2.3 Variables and Data Types - Narrowing vs Widening conversions
In Java, **type conversion** happens when you change a value from one data type to another.  
#### Widening Conversion
- **Automatic conversion** from a **smaller to a larger** data type
- **No data loss**
- Handled **by Java**
#### Narrowing Conversion
- **Manual conversion** from a **larger to a smaller** data type
- May **lose data**
- You must use **type casting**

|Conversion Type|Direction|Requires Cast?|Risk of Data Loss|Example|
|---|---|---|---|---|
|Widening|Smaller → Larger type|❌ No|❌ No|`int → double`|
|Narrowing|Larger → Smaller type|✅ Yes|✅ Yes|`double → int`|

---
## 2.4 Type Casting
**Type casting** means **converting one data type into another**.  

```
int x = 10;
double y = x; // int → double (automatic)

double price = 9.99;
int rounded = (int) price; // double → int (decimal part lost)
```

---
## 3.0 Printing in Java with System.out
In Java, `System.out` is a built-in object that lets you print messages to the screen.  
It is a **PrintStream** object, connected to the **standard output stream** — which usually means your terminal or console. 

Example:
```
System.out.println("Hello, world!");
```

#### Other Print Methods
Here are other ways to print using `System.out`

| Method      | Adds New Line | Supports Formatting | Use Case                  |
| ----------- | ------------- | ------------------- | ------------------------- |
| `println()` | Yes           | No                  | Simple messages           |
| `print()`   | No            | No                  | Continue on the same line |
| `printf()`  | Optional      | Yes                 | Precise formatted output  |
Example of `printf()`:

```
System.out.printf("Name: %s, Age: %d\n", "Alice", 25);
```
#### Format Specifiers for `printf()`

| Specifier | Description                    |
| --------- | ------------------------------ |
| `%s`      | String                         |
| `%d`      | Integer (decimal)              |
| `%f`      | Floating-point number          |
| `%.2f`    | Floating-point with 2 decimals |
| `\n`      | New line                       |
| `\t`      | Tab space                      |

---
## 4.0 Arithmetic Operators in Java
An **arithmetic expression** is a piece of code that **performs math** using operators like `+`, `-`, `*`, `/`, and `%`. It **evaluates to a number**.

|Operator|Name|Example|Result|
|---|---|---|---|
|`+`|Addition|`5 + 3`|`8`|
|`-`|Subtraction|`5 - 2`|`3`|
|`*`|Multiplication|`4 * 2`|`8`|
|`/`|Division|`10 / 2`|`5`|
|`%`|Modulus|`10 % 3`|`1` (remainder)|
```
int a = 10 + 5;       // 15
int b = 20 - 8;       // 12
int c = 3 * 4;        // 12
int d = 16 / 4;       // 4
int e = 9 % 2;        // 1
```

#### String Concatenation with `+`
In Java, the `+` operator is also used to **combine (concatenate) strings**.

```
String name = "Alice";
String greeting = "Hello, " + name;
System.out.println(greeting); // Output: Hello, Alice
```

---