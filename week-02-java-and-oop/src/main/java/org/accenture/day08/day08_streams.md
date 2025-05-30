# Streams
A **Stream** in Java is a pipeline of data processing steps used to work with **collections (like `List`, `Set`) in a functional and declarative way**.

A **conveyor belt** that takes a bunch of data (a collection), passes each item through **stations** (filters, transformers, etc.), and then gives you a final **output** (a result or new collection).

|Concept|Description|
|---|---|
|**Not a Data Structure**|Stream doesn't store data. It operates **on** data (like `List`, `Set`, etc.)|
|**Pipeline**|You chain operations: `.filter()`, `.map()`, `.collect()`, etc.|
|**Lazy Evaluation**|Nothing happens until a **terminal operation** (like `.collect()`) is called|
|**One-Time Use**|Streams can’t be reused after they’re consumed|
## Java Streams Best Practices + Why

| **Category**          | **Best Practices / Tips**                                                                  | **Why**                                                                                                       |
| --------------------- | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------- |
| **Performance**       | Avoid using `.stream()` for small collections in performance-critical code                 | The overhead of streams may outweigh the benefit; plain loops are often faster for small tasks                |
| **Debugging**         | Use `.peek()` carefully — don’t rely on it for modifying values                            | `peek()` is intended for inspection only; modifying in `peek()` leads to side effects and confusion           |
| **Collecting**        | Prefer `Collectors.toMap()` and `Collectors.groupingBy()` for building maps                | These are optimized and readable ways to transform and aggregate data in stream pipelines                     |
| **Stateful Ops**      | Be cautious with `sorted()`, `distinct()` — they require internal memory and can be slow   | They hold elements in memory to operate correctly, which affects performance on large datasets                |
| **Parallel Streams**  | Only use `.parallelStream()` when operations are CPU-bound and elements are independent    | Parallelization introduces thread overhead; only worth it for heavy and parallel-safe tasks                   |
| **Null Safety**       | Streams don’t allow `null` values — filter or guard against them                           | `null` in streams can cause `NullPointerException` in map/filter and break method references                  |
| **Immutability**      | Streams don’t modify the original source — they produce new results                        | Ensures functional-style purity and prevents side effects on the original data                                |
| **Lazy Evaluation**   | Intermediate operations are lazy; a terminal operation is required to run the pipeline     | Stream stages only execute when a terminal op (`collect`, `forEach`, etc.) is invoked                         |
| **Optional Handling** | `findFirst()` and `reduce()` return `Optional` — handle with `.orElse`, `.ifPresent`, etc. | These operations might return nothing — safely handle the absence of values to avoid `NoSuchElementException` |

---

# Source -> Intermediate -> Terminal

### 🔵 Source
- Starts the stream (e.g. `stream()`, `Arrays.stream()`)
### 🟡 Intermediate
- Transforms the data (can chain multiple)
- **Lazy:** Nothing runs until a terminal op is invoked
### 🔴 Terminal
- Ends the stream pipeline and triggers computation

| **Stream Operation** | **Functional Interface**            | **Lambda Signature** | **Example Lambda**                  | **Type**            | **Purpose**                         |
| -------------------- | ----------------------------------- | -------------------- | ----------------------------------- | ------------------- | ----------------------------------- |
| `stream()`           | —                                   | —                    | `list.stream()`                     | 🔵 **Source**       | Converts a collection into a stream |
| `filter()`           | `Predicate<T>`                      | `T -> boolean`       | `x -> x > 10`                       | 🟡 **Intermediate** | Filters elements by condition       |
| `map()`              | `Function<T, R>`                    | `T -> R`             | `s -> s.length()`                   | 🟡 **Intermediate** | Transforms element type             |
| `flatMap()`          | `Function<T, Stream<R>>`            | `T -> Stream<R>`     | `list -> list.stream()`             | 🟡 **Intermediate** | Flattens nested streams             |
| `distinct()`         | —                                   | —                    | `.distinct()`                       | 🟡 **Intermediate** | Removes duplicates                  |
| `sorted()`           | `Comparator<T>`                     | `(T, T) -> int`      | `(a, b) -> a.compareTo(b)`          | 🟡 **Intermediate** | Sorts elements                      |
| `peek()`             | `Consumer<T>`                       | `T -> void`          | `x -> System.out.println(x)`        | 🟡 **Intermediate** | Debugging/logging                   |
| `limit()`            | —                                   | —                    | `.limit(5)`                         | 🟡 **Intermediate** | Limits to N elements                |
| `skip()`             | —                                   | —                    | `.skip(3)`                          | 🟡 **Intermediate** | Skips N elements                    |
| `collect()`          | `Collector<T, A, R>`                | Custom               | `Collectors.toList()`               | 🔴 **Terminal**     | Collects into a container           |
| `toMap()`            | `Function<T, K>` + `Function<T, V>` | `T -> K`, `T -> V`   | `x -> x.getId(), x -> x.getName()`  | 🔴 **Terminal**     | Collects into a map                 |
| `groupingBy()`       | `Function<T, K>`                    | `T -> K`             | `x -> x.getCategory()`              | 🔴 **Terminal**     | Groups elements by key              |
| `reduce()`           | `BinaryOperator<T>`                 | `(T, T) -> T`        | `(a, b) -> a + b`                   | 🔴 **Terminal**     | Combines all elements into one      |
| `forEach()`          | `Consumer<T>`                       | `T -> void`          | `x -> System.out.println(x)`        | 🔴 **Terminal**     | Consumes each element               |
| `count()`            | —                                   | —                    | `.count()`                          | 🔴 **Terminal**     | Counts the elements                 |
| `anyMatch()`         | `Predicate<T>`                      | `T -> boolean`       | `x -> x > 100`                      | 🔴 **Terminal**     | Checks if any match                 |
| `allMatch()`         | `Predicate<T>`                      | `T -> boolean`       | `x -> x != null`                    | 🔴 **Terminal**     | Checks if all match                 |
| `noneMatch()`        | `Predicate<T>`                      | `T -> boolean`       | `x -> x.isEmpty()`                  | 🔴 **Terminal**     | Checks if none match                |
| `findFirst()`        | `Predicate<T>` (typically)          | `T -> boolean`       | `x -> x.startsWith("A")`            | 🔴 **Terminal**     | Returns first matching element      |
| `findAny()`          | `Predicate<T>` (typically)          | `T -> boolean`       | `x -> x.isActive()`                 | 🔴 **Terminal**     | Returns any matching element        |
| `max()` / `min()`    | `Comparator<T>`                     | `(T, T) -> int`      | `(a, b) -> a.getAge() - b.getAge()` | 🔴 **Terminal**     | Finds max/min by comparator         |