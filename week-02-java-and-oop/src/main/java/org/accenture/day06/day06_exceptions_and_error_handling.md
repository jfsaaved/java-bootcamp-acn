# Exceptions

An **exception** in Java is an **event that disrupts the normal flow of a program** when something goes wrong during execution.

All exceptions are objects that inherit from:
```java
java.lang.Throwable
├── Error (serious issues, usually not handled)
└── Exception (things you can handle)
     ├── Checked Exceptions (e.g., IOException)
     └── Unchecked Exceptions (e.g., NullPointerException)
```

|Type|Examples|Needs to be handled?|
|---|---|---|
|**Checked**|`IOException`, `SQLException`|✅ Yes (must handle or declare with `throws`)|
|**Unchecked**|`NullPointerException`, `IndexOutOfBoundsException`|❌ No (runtime exceptions)|
|**Errors**|`OutOfMemoryError`, `StackOverflowError`|❌ No (fatal, usually not recoverable)|
#### How to Handle Exceptions

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
}

You can also throw your own:

if (amount < 0) {
    throw new IllegalArgumentException("Amount must be positive");
}
```