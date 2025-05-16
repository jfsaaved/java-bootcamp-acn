# Day 03 - Loops

This guide covers all looping mechanisms in Java, from basic usage to subtle behaviors and important best practices.

---
## Additional Resources

### Free Resources
[Loops in Java - programiz](https://www.programiz.com/java-programming/for-loop)    

---
## 1. Types of Loops in Java

### For Loop
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```
- Best for when you know how many times to iterate.

### While Loop
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```
- Use when you don't know the number of iterations in advance.

### Do-While Loop
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```
- Runs **at least once**, even if the condition is false initially.

### Enhanced For Loop (For-each)
```java
int[] numbers = {1, 2, 3};
for (int num : numbers) {
    System.out.println(num);
}
```
- Cleanest way to loop over arrays, lists, and other iterable collections.
- Cannot modify the collection itself (e.g. remove elements) during iteration.

---

## 2. Loop Control Keywords

### Break
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) break;
    System.out.println(i);
}
```
- Exits the loop entirely.

### Continue
```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) continue;
    System.out.println(i); // only prints odd numbers
}
```
- Skips the current iteration and moves to the next.

### Labels with Break/Continue
```java
outer:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (i == j) break outer;
        System.out.println(i + "," + j);
    }
}
```
- Useful for breaking out of nested loops, but should be used sparingly.

---

## 3. Infinite Loops

### Intentional Infinite Loop
```java
while (true) {
    // Keep running forever unless broken manually
    if (conditionMet()) break;
}
```

### Loop Without Condition
```java
for (;;) {
    // Also infinite
}
```
- Often used in low-level systems or event listeners.

---

## 4. Subtleties and Considerations

### Modifying Collections During Iteration
```java
List<String> names = new ArrayList<>(List.of("Alice", "Bob"));
for (String name : names) {
    names.remove(name); // throws ConcurrentModificationException
}
```
- Use an Iterator with `iterator.remove()` or loop backward to safely remove items.

### Off-by-One Errors
```java
for (int i = 0; i <= 5; i++) {
    // runs 6 times: 0, 1, 2, 3, 4, 5
}
```
- Be clear whether your loop should include the endpoint or not.

### Shadowed Variables
```java
for (int i = 0; i < 3; i++) {
    int i = 10; // error: i already defined
}
```
- You cannot redefine loop variables inside the same block.

### Floating-Point Precision
```java
for (double d = 0.1; d <= 1.0; d += 0.1) {
    System.out.println(d);
}
```
- May not behave as expected due to floating-point rounding errors.
- Prefer integer-based counters when possible.

### Performance Considerations
- Avoid unnecessary recalculations in loop conditions:
```java
for (int i = 0; i < expensiveCall(); i++) // avoid this
```
- Store the result outside the loop if it doesn't change.

---
## 5. Best Practices

- Use descriptive variable names (`index` instead of `i`, if clarity helps).
- Avoid deep nesting by using `continue` or breaking logic into methods.
- Be cautious with infinite loops; ensure there's a valid exit strategy.
- Prefer enhanced for-loops when you don’t need the index.

---

Loops are one of the most fundamental tools in Java. Understanding their flexibility, behavior, and caveats allows you to write clearer, safer, and more efficient code.
