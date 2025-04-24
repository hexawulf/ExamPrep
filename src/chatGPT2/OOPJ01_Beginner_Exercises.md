
# 🐾 DLBCSOOPJ01 Java Beginner Exercises

A curated list of 21 beginner-level Java exercises based strictly on the official course book `001‑2023‑0713_DLBCSOOPJ01_Course_Book.pdf`. Each exercise focuses on a single topic aligned with course content.

---

## 🚀 Exercise 1: Define Your First Class
**Task:** Create a class named `Dog` with no attributes or methods.  
**Course-book alignment:** Unit 3, Section 3.2 (Page 41)  
**Target concept:** Class declaration syntax

---

## 🐶 Exercise 2: Add Attributes
**Task:** Extend the `Dog` class by adding two attributes: `name` (String) and `age` (int).  
**Course-book alignment:** Unit 3, Section 3.3 (Page 42)  
**Target concept:** Defining instance attributes

---

## 🛠️ Exercise 3: Add Methods
**Task:** Add two methods to the `Dog` class: `getName()` and `getAge()`.  
**Course-book alignment:** Unit 3, Section 3.4 (Page 44)  
**Target concept:** Instance methods and encapsulation

---

## 🔄 Exercise 4: Using the Main Method
**Task:** Create a `DogTest` class with a `main` method that creates and prints a `Dog`'s name and age.  
**Course-book alignment:** Unit 3, Section 3.5 (Page 51)  
**Target concept:** Main method

---

## 📦 Exercise 5: Working with Variables
**Task:** Declare and initialize `int`, `double`, and `String` variables.  
**Course-book alignment:** Unit 4, Section 4.2 (Page 57)  
**Target concept:** Local variables

---

## ➕ Exercise 6: Basic Arithmetic
**Task:** Create a `Calculator` class with a method `add(int a, int b)`.  
**Course-book alignment:** Unit 4, Section 4.3 (Page 59)  
**Target concept:** Arithmetic operators

---

## 🤔 Exercise 7: Conditional Logic
**Task:** Write `isAdult(int age)` method that returns `true` if age >= 18.  
**Course-book alignment:** Unit 4, Section 4.4 (Page 64)  
**Target concept:** If-else statements

---

## 🔢 Exercise 8: For Loop Practice
**Task:** Write `printSquares()` to print squares from 1 to 5.  
**Course-book alignment:** Unit 4, Section 4.4 (Page 70)  
**Target concept:** For loop

---

## 🔁 Exercise 9: While Loop Practice
**Task:** Write a `countdown()` from 5 to 1 using a while loop.  
**Course-book alignment:** Unit 4, Section 4.4 (Page 69)  
**Target concept:** While loop

---

## 🧮 Exercise 10: Arrays and Access
**Task:** Declare an array of 5 integers and print the first and last.  
**Course-book alignment:** Session 3 (Arrays)  
**Target concept:** Array access

---

## 📥 Exercise 11: Getter and Setter
**Task:** Add `setName(String newName)` to the `Dog` class.  
**Course-book alignment:** Unit 3, Section 3.4 (Page 44)  
**Target concept:** Encapsulation

---

## 🔁 Exercise 12: Method Overloading
**Task:** Overload `add(int a, int b)` with `add(double a, double b)`.  
**Course-book alignment:** Unit 3, Section 3.4 (Page 47)  
**Target concept:** Overloading

---

## 🏗️ Exercise 13: Constructor Creation
**Task:** Create a constructor in `Dog` that sets `name` and `age`.  
**Course-book alignment:** Unit 7, Section 7.1 (Page 104)  
**Target concept:** Constructor

---

## 🔨 Exercise 14: Constructor Overloading
**Task:** Overload `Dog` constructor with one that only sets `name`.  
**Course-book alignment:** Unit 7, Section 7.2 (Page 107)  
**Target concept:** Constructor overloading

---

## 🔒 Exercise 15: Access Modifiers
**Task:** Make `name` private and use a public getter for it.  
**Course-book alignment:** Unit 4, Section 4.5 (Page 73)  
**Target concept:** Visibility modifiers

---

## 🧬 Exercise 16: Inheritance Basics
**Task:** Create a `Puppy` class that extends `Dog`.  
**Course-book alignment:** Unit 5, Section 5.2 (Page 83)  
**Target concept:** Inheritance

---

## 🔁 Exercise 17: Method Overriding
**Task:** Override `speak()` in `Puppy` to print `"Yip!"`.  
**Course-book alignment:** Unit 5, Section 5.2 (Page 87)  
**Target concept:** Method overriding

---

## 🧭 Exercise 18: Using `super`
**Task:** In `Puppy` constructor, use `super()` to call `Dog`'s constructor.  
**Course-book alignment:** Unit 7, Section 7.3 (Page 112)  
**Target concept:** `super()` constructor chaining

---

## 🧱 Exercise 19: Abstract Class Example
**Task:** Make `Animal` an abstract class with an abstract method `speak()`.  
**Course-book alignment:** Unit 6, Section 6.1 (Page 92)  
**Target concept:** Abstract classes and methods

---

## 🧠 Exercise 20: Polymorphism in Action
**Task:** Write `makeAnimalSpeak(Animal a)` and pass `Dog`, `Puppy`.  
**Course-book alignment:** Unit 6, Section 6.2 (Page 96)  
**Target concept:** Polymorphism

---

## 🎁 Exercise 21: Copy Constructor
**Task:** Add a copy constructor to `Dog` class that clones another `Dog`.  
**Course-book alignment:** Unit 7 (constructors), inferred from 7.2  
**Target concept:** Copy constructor

```java
Dog original = new Dog("Wulf", 3);
Dog copy = new Dog(original);
```

---
