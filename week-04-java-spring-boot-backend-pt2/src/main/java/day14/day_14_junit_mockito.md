# Learning Guide 
We will create unit tests for our day13 Greeting Client application using JUnit 5 and Mockito
#### Topics Covered:
- **JUnit 5** – @Test, @BeforeEach, and assertions like assertEquals, assertTrue, etc.
- **Mockito** – mock dependencies, inject mocks, stub behaviors, and verify interactions

---
# JUnit 5
JUnit 5 is a modern Java testing framework that allows you to write test cases.

`@ExtendWith(MockitoExtension.class)` is a **JUnit 5 annotation** that tells JUnit to **enable Mockito** for the test class.
### Key Annotations

| Annotation    | Description                                  |
| ------------- | -------------------------------------------- |
| `@Test`       | Marks a method as a test case                |
| `@BeforeEach` | Runs before each test (setup/initialization) |
| `@AfterEach`  | Runs after each test (cleanup, optional)     |
### Common Assertions

|Assertion|Purpose|
|---|---|
|`assertEquals(a, b)`|Checks that `a` equals `b`|
|`assertTrue(condition)`|Checks that the condition is `true`|
|`assertThrows(...)`|Asserts that an exception is thrown|

---
# Mockito
Mockito is a library that allows you to create **mock objects** — fake versions of classes that behave the way you tell them to. Allows you to:
- Not call the real class (e.g., an external API)
- Have full control over return values and behavior
### Key Concepts

|Keyword|Purpose|
|---|---|
|`@Mock`|Create a mock object|
|`@InjectMocks`|Inject mock objects into the class under test|
|`when(...).thenReturn(...)`|Stub behavior of a method|
|`verify(...)`|Confirm that a method was called|

---
