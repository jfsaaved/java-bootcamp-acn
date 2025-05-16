
# Java Data Structures and Algorithms – Fundamentals

This guide introduces essential data structures and algorithms in Java, their purpose, and common use cases. It includes a few simple examples and one advanced structure to show how data is organized and processed in different ways.

---

## 1. Arrays

### What It Is:
A fixed-size collection of elements of the same type.

### Example:
```java
int[] numbers = {1, 2, 3, 4};
System.out.println(numbers[0]); // 1
```

- Fast access by index (O(1))
- Fixed size after creation
- Used when size is known ahead of time

---

## 2. ArrayList

### What It Is:
A resizable array (part of `java.util`).

### Example:
```java
List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
System.out.println(names.get(1)); // Bob
```

- Dynamically resizable
- Slower inserts/removals in the middle (O(n))
- Good for ordered lists where you need random access

---

## 3. LinkedList

### What It Is:
A sequence of nodes, each pointing to the next.

### Example:
```java
List<Integer> list = new LinkedList<>();
list.add(10);
list.addFirst(5);
System.out.println(list); // [5, 10]
```

- Fast insertions/removals at both ends
- Slower access by index
- Useful for queue-like or stack-like structures

---

## 4. HashMap

### What It Is:
A key-value pair data structure.

### Example:
```java
Map<String, Integer> scores = new HashMap<>();
scores.put("Alice", 90);
System.out.println(scores.get("Alice")); // 90
```

- Fast lookup by key (average O(1))
- No guaranteed order
- Useful for indexing, counting, and lookups

---

## 5. Stack and Queue

### Stack (LIFO):
```java
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.push(2);
System.out.println(stack.pop()); // 2
```

### Queue (FIFO):
```java
Queue<Integer> queue = new LinkedList<>();
queue.add(1);
queue.add(2);
System.out.println(queue.poll()); // 1
```

- Stack is Last-In-First-Out (undo operations)
- Queue is First-In-First-Out (task scheduling)

---

## 6. Set and HashSet

### What It Is:
A collection that contains no duplicates.

### Example:
```java
Set<String> fruits = new HashSet<>();
fruits.add("Apple");
fruits.add("Apple");
System.out.println(fruits.size()); // 1
```

- No duplicates
- Unordered
- Good for membership checks

---

## 7. Sorting Algorithms

### Bubble Sort (Simple Example):
```java
void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

- Inefficient (O(n^2)) but easy to understand

---

## 8. Searching Algorithms

### Linear Search:
```java
int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) return i;
    }
    return -1;
}
```

### Binary Search (Sorted Array Only):
```java
int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
```

- Binary search is O(log n) but requires sorted input

---

## 9. Recursion (Core Algorithm Concept)

### Factorial Example:
```java
int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
}
```

- Calls itself
- Used in divide-and-conquer problems (e.g. merge sort, tree traversal)

---

## 10. Tree (Advanced Structure)

### Binary Tree Node:
```java
class Node {
    int value;
    Node left, right;
    Node(int value) {
        this.value = value;
    }
}
```

### In-Order Traversal:
```java
void inOrder(Node node) {
    if (node == null) return;
    inOrder(node.left);
    System.out.print(node.value + " ");
    inOrder(node.right);
}
```

- Tree structures are used in compilers, databases, and game engines
- In-order traversal prints sorted order if it's a binary search tree

---

## Summary

- Arrays and ArrayLists store ordered values
- LinkedLists are better for frequent insertions/removals
- HashMaps provide fast key-based access
- Stacks and Queues help with structured order of processing
- Sets enforce uniqueness
- Sorting and searching algorithms are key for data handling
- Trees are foundational for more complex systems

Mastering these fundamentals helps in both day-to-day programming and technical interviews.
