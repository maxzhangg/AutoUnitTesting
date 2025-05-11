# Automated Unit Test Generation using EvoSuite and Randoop

This repository demonstrates automated unit test generation for a collection of data structures using two tools: **EvoSuite** and **Randoop**. The target classes are from the popular open-source Java library [java-algorithms-implementation](https://github.com/phishman3579/java-algorithms-implementation).

## 📌 Description

Part 4 of SYSC5807 Assignment 1 focused on generating and evaluating unit tests for the following data structures:

- SkipListMap
- SuffixTrie
- DisjointSet
- TrieMap
- Matrix
- Graph

## 🛠 Tools Used

### EvoSuite
EvoSuite generates unit tests using **search-based software engineering** techniques. It evolves test suites to achieve maximum code coverage by using genetic algorithms.

- Only works with Java 8 (1.8)
- Command line generation, compilation, and execution
- Results stored in `evosuite_testcases/`

### Randoop
Randoop generates unit tests by **randomly constructing sequences of method calls** for a given class. It then filters out invalid or redundant tests.

- Also requires Java 8
- Simpler to set up and faster to generate
- Test cases stored in `randoop_*_testcases/`

## 📁 Directory Structure

- `evosuite_testcases/`: Contains EvoSuite-generated test classes.
- `randoop_*_testcases/`: Each folder contains Randoop-generated test classes for a specific data structure.
- `java-algorithms-implementation/src/`: Source code under test.

## 🧪 How to Run Tests

Ensure you have:
- Java 1.8 installed and `JAVA_HOME` set correctly.
- JUnit 4 and its dependencies downloaded.

To compile and run the generated test cases, follow the command instructions inside each folder's `README` or refer to the official tool documentation.

## 📊 Evaluation

Tests were compared based on:
- Ease of setup and configuration
- Readability and maintainability of test cases
- Fault detection effectiveness

## 📚 References

- [EvoSuite Official Site](https://www.evosuite.org/)
- [Randoop GitHub](https://github.com/randoop/randoop)
- [Original Java Algorithms Repo](https://github.com/phishman3579/java-algorithms-implementation)
