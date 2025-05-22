# Day 03 - Arrays, and Loops

This guide covers all looping mechanisms in Java, from basic usage to subtle behaviors and important best practices.

---
## Additional Resources

### Free Resources
[Loops in Java - programiz](https://www.programiz.com/java-programming/for-loop)    
[Arrays - jenkov](https://jenkov.com/tutorials/java/arrays.html)

---
# **Arrays**

#### Declaring Arrays
```java
int[] numbers;           // declaration
numbers = new int[5];    // allocation (5 integers: 0 0 0 0 0)

or

int[] numbers = new int[5];
```

#### Initializing Arrays
```java
int[] scores = {90, 85, 88, 70, 95};

or

String[] names = new String[3];  // all null
```

#### Accessing Elements
```java
System.out.println(scores[0]);  // prints 90
scores[2] = 100;                // change 3rd element to 100
```

#### Array Indexing
- Index starts at **0**
- `array.length` gives the number of elements
- Accessing an invalid index throws error

---
# **Loops**
## Types of Loops in Java

### For Loop
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// Iterating through arrays
int[] scores = {0, 2, 3, 4, 5}
for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
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

// Iterating through arrays
for (int score : scores) {
    System.out.println(score);
}
```
- Cleanest way to loop over arrays, lists, and other iterable collections.
- Cannot modify the collection itself (e.g. remove elements) during iteration.

---

## Loop Control Keywords

### Break
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) break;
    System.out.println(i); // Won't execute
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
- Useful for breaking out of nested loops

---
## Infinite Loops

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

---

## Subtleties and Considerations

### Modifying Collections During Iteration
```java
List<String> names = new ArrayList<>(List.of("Alice", "Bob"));
for (String name : names) {
    names.remove(name); // throws ConcurrentModificationException
}
```
- Use an Iterator with `iterator.remove()` to safely remove items.

### Off-by-One Errors
```java
for (int i = 0; i <= 5; i++) {
    // runs 6 times: 0, 1, 2, 3, 4, 5
}
```
- Be clear whether your loop should include the endpoint or not.

---