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

---

## Checked vs Unchecked Exceptions

| Feature                 | Checked Exception             | Unchecked Exception                                |
| ----------------------- | ----------------------------- | -------------------------------------------------- |
| Inherits from           | `Exception`                   | `RuntimeException`                                 |
| Compiler requires catch | ✅ Yes                         | ❌ No                                               |
| Common examples         | `IOException`, `SQLException` | `NullPointerException`, `IllegalArgumentException` |

---
## When to Use **Checked Exceptions**
Use **checked exceptions** when:
- The error is **recoverable**
- You want to **force the caller** to think about handling it
- It’s part of the **expected control flow**
## When to Use **Unchecked Exceptions**
Use **unchecked exceptions** when:
- It's a **programming error** (bad input, illegal state, null, etc.)
- It’s **not expected** to be recoverable
- You want to **fail fast**, not clutter code with try-catch

| Question                               | Answer                                     |
| -------------------------------------- | ------------------------------------------ |
| Is the error expected & recoverable?   | ✅ Yes → Use **checked** exception          |
| Is it a bug or logic misuse?           | ❌ No → Use **unchecked** exception         |
| Should callers be forced to handle it? | ✅ → Use **checked**, ❌ → Use **unchecked** |

---

