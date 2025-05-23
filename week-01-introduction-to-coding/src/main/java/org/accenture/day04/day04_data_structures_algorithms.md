
# Java Data Structures and Algorithms

## Free Resource
https://roadmap.sh/datastructures-and-algorithms

---
# Data
**Data** is any piece of information that can be stored, processed, transmitted, and/or analyzed by an application/service.

Some things to expect in a Backend role:
- **Large Amounts of Data:**
    
    Data-intensive applications handle massive datasets, sometimes referred to as "big data". This can include structured data (e.g., database records) and unstructured data (e.g., text documents, images, videos).

**Data Processing:**
    The application must be able to process the data in various ways, including batch processing (processing large chunks of data at a time) and stream processing (processing data as it arrives).

---
# Data Structures in Java

| Data Structure | Description                      | Example Usage                       |
| -------------- | -------------------------------- | ----------------------------------- |
| `Array`        | Fixed-size, indexed collection   | Holding 10 numbers                  |
| `ArrayList`    | Resizable array                  | Dynamic list of usernames           |
| `HashMap`      | Key-value store                  | Mapping usernames to user profiles  |
| `HashSet`      | Unordered set with no duplicates | Ensuring unique email addresses     |
| `Stack`        | LIFO (Last In, First Out)        | Undo feature in a text editor       |
| `Queue`        | FIFO (First In, First Out)       | Processing tasks in order           |
| `LinkedList`   | Elements linked via nodes        | Custom list with fast insert/delete |
#### HashMaps & ArrayLists

| Feature              | `HashMap<K, V>`                               | `ArrayList<E>`                         |
| -------------------- | --------------------------------------------- | -------------------------------------- |
| **Type**             | Key-value pair collection                     | Ordered list of elements (index-based) |
| **Stores**           | Entries: one key → one value                  | Single values                          |
| **Access by**        | `key`                                         | `index`                                |
| **Ordering**         | No guaranteed order                           | Keeps insertion order                  |
| **Duplicates**       | ❌ Keys must be unique                         | ✅ Allows duplicate values              |
| **Nulls**            | ✅ One `null` key, multiple `null` values      | ✅ Allows `null` values                 |
| **Common use cases** | Lookup table, map IDs to data, cache          | List of items, ordered data, looping   |
| **Access speed**     | Fast (O(1) for key lookup)                    | Fast for index access, slow to search  |
| **Insertion speed**  | Fast (amortized O(1))                         | Fast at end, slower at front           |
| **Syntax Example**   | `map.put("a", 100);`                          | `list.add(100);`                       |
| **Key methods**      | `put()`, `get()`, `remove()`, `containsKey()` | `add()`, `get()`, `set()`, `remove()`  |

---
# Algorithms in Java

| Task                       | Data Structure          | Algorithm Involved             |
| -------------------------- | ----------------------- | ------------------------------ |
| Store user info            | `HashMap<String, User>` | Key-value mapping              |
| Sort transactions by time  | `List<Transaction>`     | Sorting (`Collections.sort`)   |
| Process requests in order  | `Queue<Request>`        | FIFO algorithm                 |
| Search by username         | `List<User>` or `Map`   | Linear or constant-time search |
| Validate login credentials | Variables / Strings     | String comparison algorithm    |




