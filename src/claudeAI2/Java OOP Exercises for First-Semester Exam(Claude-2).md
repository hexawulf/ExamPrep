# Java OOP Exercises for First-Semester Exam

This document contains 20 Java coding exercises suitable for a first-semester Object-Oriented Programming exam. Each exercise focuses on a specific Java language element covered in the DLBCSOOPJ01 course.

## Exercise 1: Basic Class Structure

Create a class named `Book` with three attributes: title (String), author (String), and yearPublished (int). Include appropriate visibility modifiers for the attributes. The class should not contain any methods yet.

*Target concept: Basic class structure with attributes (Unit 3, Section 3.2-3.3, pp. 41-44)*

## Exercise 2: Getter and Setter Methods

Extend the `Customer` class below by adding getter and setter methods for each attribute. Follow proper Java naming conventions.

```java
public class Customer {
    private String firstName;
    private String lastName;
    private String email;
}
```

*Target concept: Implementing getter and setter methods (Unit 3, Section 3.4, pp. 44-50)*

## Exercise 3: Creating Objects

Write a Java main method that creates two `Rectangle` objects. The `Rectangle` class has two attributes: width and height. Set different values for each object's attributes and print them to the console.

*Target concept: Object creation and attribute assignment (Unit 3, Section 3.5, pp. 51-54)*

## Exercise 4: Primitive Data Types

Write a Java program that declares variables of each primitive data type covered in the course. Assign appropriate values to each variable and print them.

*Target concept: Primitive data types in Java (Unit 4, Section 4.1, pp. 56-57)*

## Exercise 5: Arithmetic Operations

Write a Java program that calculates the area and perimeter of a rectangle. The program should declare variables for width and height, perform the calculations, and output the results.

*Target concept: Variables and arithmetic operators (Unit 4, Sections 4.2-4.3, pp. 57-60)*

## Exercise 6: Conditional Statement

Write a Java method called `checkAge` that takes an integer parameter representing a person's age and returns a String. If the age is less than 18, return "Minor". If the age is between 18 and 65 (inclusive), return "Adult". If the age is greater than 65, return "Senior".

*Target concept: Conditional branching with if-else statements (Unit 4, Section 4.4, pp. 64-69)*

## Exercise 7: For Loop Implementation

Write a Java method called `sumNumbers` that takes an integer parameter `n` and returns the sum of all integers from 1 to n (inclusive).

*Target concept: For loop structure (Unit 4, Section 4.4, pp. 69-72)*

## Exercise 8: While Loop Implementation

Write a Java method called `findDigitCount` that takes an integer parameter and returns the number of digits in that integer using a while loop.

*Target concept: While loop implementation (Unit 4, Section 4.4, pp. 69-71)*

## Exercise 9: Nested Loops

Write a Java method that prints a pattern of asterisks forming a right-angled triangle with n rows, where n is a parameter passed to the method.

Example output for n=4:

```
*
**
***
****
```

*Target concept: Nested control structures (Unit 4, Section 4.4, pp. 72-73)*

## Exercise 10: Package Declaration

Create a Java class called `Product` and place it in a package named `com.onlineshop.inventory`. Include the appropriate package declaration at the top of the file.

*Target concept: Package declaration (Unit 4, Section 4.5, pp. 73-75)*

## Exercise 11: Inheritance

Create a superclass called `Vehicle` with attributes for manufacturer and modelYear. Then create a subclass called `Car` that extends `Vehicle` and adds an attribute for numberOfDoors. Include appropriate constructors for both classes.

*Target concept: Inheritance with extends keyword (Unit 5, Section 5.2, pp. 83-86)*

## Exercise 12: Method Overriding

Create a superclass called `Shape` with a method called `calculateArea()` that returns 0.0. Create two subclasses: `Circle` with a radius attribute and `Rectangle` with width and height attributes. Override the `calculateArea()` method in both subclasses to return the correct area value.

*Target concept: Method overriding in subclasses (Unit 5, Section 5.2, pp. 87-90)*

## Exercise 13: Abstract Class

Create an abstract class called `Animal` with an abstract method `makeSound()`. Then create two concrete subclasses `Dog` and `Cat` that implement the abstract method appropriately.

*Target concept: Abstract classes and methods (Unit 6, Section 6.1, pp. 92-96)*

## Exercise 14: Polymorphism

Write a Java method called `printShapeDetails` that takes a parameter of type `Shape` and prints information about the shape, including its area. Show how this method can be called with different shape objects (Circle, Rectangle) to demonstrate polymorphic behavior.

*Target concept: Polymorphism (Unit 6, Section 6.2, pp. 96-99)*

## Exercise 15: Static Members

Create a class called `MathUtility` with a static attribute called `PI` with value 3.14159, and a static method called `calculateCircleArea` that takes a radius parameter and returns the area of the circle.

*Target concept: Static attributes and methods (Unit 6, Section 6.3, pp. 99-102)*

## Exercise 16: Constructors

Create a class called `BankAccount` with attributes for accountNumber, owner, and balance. Implement three constructors:

1. A default constructor that sets default values
2. A constructor that takes accountNumber and owner parameters
3. A constructor that takes all three parameters

*Target concept: Constructors and constructor overloading (Unit 7, Sections 7.1-7.2, pp. 104-111)*

## Exercise 17: Copy Constructor

Create a class called `Student` with attributes for name, id, and gpa. Implement a regular constructor and a copy constructor that creates a new `Student` object with the same attributes as an existing `Student` object.

*Target concept: Copy constructor (Unit 7, Section 7.2, pp. 111-112)*

## Exercise 18: Exception Handling

Write a Java method called `divideNumbers` that takes two integer parameters and returns their quotient. Use a try-catch block to handle the potential ArithmeticException that could occur if the second parameter is zero. If an exception occurs, return 0.

*Target concept: Exception handling with try-catch blocks (Unit 8, Section 8.2, pp. 119-123)*

## Exercise 19: Custom Exception

Create a custom exception class called `InvalidAgeException` that extends `Exception`. Then write a method called `validateAge` that takes an age parameter and throws this custom exception if the age is negative or greater than 120.

*Target concept: User-defined exceptions (Unit 8, Section 8.3, pp. 124-127)*

## Exercise 20: Interfaces

Create an interface called `Comparable` with a method called `compareTo` that takes an Object parameter and returns an integer. Implement this interface in a class called `Person` with a name attribute, where the `compareTo` method compares persons based on their names alphabetically.

*Target concept: Interfaces and interface implementation (Unit 9, Section 9.2, pp. 133-137)*