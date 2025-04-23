This contains a set of very basic exercises useful for first learners of the Java Programming Language.

Generated with the prompt:
Updated Prompt:
Task. Use only the material in “Course_Book.pdf” to write 20 beginner‑friendly Java coding exercises suitable for a first‑semester OOP exam.

Exercise design rules



One topic each. Every exercise must centre on a single Java construct or introductory OOP idea that the course book covers (e.g., fields, methods, for loops, if‑else, constructors, access modifiers, inheritance, encapsulation, polymorphism).

Course‑book alignment. Cite the chapter / section (or page) where the concept is introduced, so students can revisit the explanation.

Beginner level. Keep syntax and logic simple enough for someone who has finished only the first‑semester syllabus. Avoid compound features (e.g., no generics + inheritance in the same task).

Problem statement. Write a short, clear description of what the student must build or fix.

Sample I/O (when meaningful). If the exercise involves console input or produces output, include one small example.

Target concept blurb. End each exercise with a one‑sentence note that names the specific Java element being assessed (e.g., “Target concept: overriding toString()”).

No answers. Do not supply solutions or hints.

Batch Gemini 2.5_2 
# First-Semester OOP Exam Practice Exercises

Based on the "Object-Oriented Programming With Java" Course Book (DLBCSOOPJ01)

Here is a set of 20 beginner-friendly Java coding exercises designed to help you prepare for your first-semester Object-Oriented Programming exam. Each exercise focuses on a key concept covered in the course material.

---

### Exercise 1: Defining a Basic Class

* **Problem Statement:** Create a simple Java class named `Dog`. This class should represent a dog with no specific properties or behaviors yet.
* **Course-book Alignment:** Unit 3, page 41
* **Target concept:** Basic class definition.

---

### Exercise 2: Adding Attributes to a Class

* **Problem Statement:** Modify the `Dog` class to include two attributes: `name` (a `String`) and `age` (an `int`). These attributes should be declared but not initialized with default values in the declaration.
* **Course-book Alignment:** Unit 3, page 42
* **Target concept:** Class attributes.

---

### Exercise 3: Defining Basic Methods

* **Problem Statement:** Add two basic methods to the `Dog` class: `bark()` which prints "Woof!" to the console, and `sleep()` which prints "Zzzzz..." to the console. These methods should not take any parameters or return any values.
* **Course-book Alignment:** Unit 3, page 44
* **Target concept:** Basic method definition.

---

### Exercise 4: The Main Method

* **Problem Statement:** Create a new class called `Kennel` with a `main` method. Inside the `main` method, create an instance of the `Dog` class and call its `bark()` and `sleep()` methods.
* **Course-book Alignment:** Unit 3, page 51
* **Target concept:** The `main` method.

---

### Exercise 5: Using Primitive Data Types

* **Problem Statement:** Write a Java program (in a `main` method) that declares and initializes variables of the following primitive data types: `int`, `double`, `boolean`, and `char`. Print the value of each variable to the console.
* **Course-book Alignment:** Unit 4, page 56
* **Sample I/O:**
    ```
    Integer value: 10
    Double value: 3.14
    Boolean value: true
    Character value: A
    ```
* **Target concept:** Primitive data types.

---

### Exercise 6: Variable Declaration and Assignment

* **Problem Statement:** Write a Java program (in a `main` method) that declares an integer variable `count`, assigns it the value 5, then reassigns it the value 10. Print the value of `count` after each assignment.
* **Course-book Alignment:** Unit 4, page 57
* **Sample I/O:**
    ```
    Initial count: 5
    Updated count: 10
    ```
* **Target concept:** Variable declaration and assignment.

---

### Exercise 7: Arithmetic Operators

* **Problem Statement:** Write a Java program (in a `main` method) that declares two integer variables, `num1` with a value of 15 and `num2` with a value of 4. Calculate and print the result of adding, subtracting, multiplying, and dividing `num1` by `num2`. Also, calculate the remainder of the division.
* **Course-book Alignment:** Unit 4, page 59
* **Sample I/O:**
    ```
    Sum: 19
    Difference: 11
    Product: 60
    Quotient: 3
    Remainder: 3
    ```
* **Target concept:** Arithmetic operators.

---

### Exercise 8: Logical Operators

* **Problem Statement:** Write a Java program (in a `main` method) that declares two boolean variables, `isJavaFun` set to `true` and `isExamSoon` set to `true`. Use logical operators (`&&`, `||`, `!`) to evaluate and print the results of the following expressions: `isJavaFun AND isExamSoon`, `isJavaFun OR isExamSoon`, and `NOT isJavaFun`.
* **Course-book Alignment:** Unit 4, page 60
* **Sample I/O:**
    ```
    Both are true: true
    At least one is true: true
    isJavaFun is not true: false
    ```
* **Target concept:** Logical operators.

---

### Exercise 9: Relational Operators

* **Problem Statement:** Write a Java program (in a `main` method) that declares two integer variables, `score1` with a value of 85 and `score2` with a value of 90. Use relational operators (`==`, `!=`, `<`, `<=`, `>`, `>=`) to compare the two scores and print the boolean result of each comparison.
* **Course-book Alignment:** Unit 4, page 60
* **Sample I/O:**
    ```
    score1 equals score2: false
    score1 not equals score2: true
    score1 is less than score2: true
    score1 is less than or equal to score2: true
    score1 is greater than score2: false
    score1 is greater than or equal to score2: false
    ```
* **Target concept:** Relational operators.

---

### Exercise 10: String Concatenation

* **Problem Statement:** Write a Java program (in a `main` method) that declares two string variables, `greeting` with the value "Hello" and `name` with the value "Student". Concatenate these two strings with a space in between and print the resulting string.
* **Course-book Alignment:** Unit 4, page 64
* **Sample I/O:**
    ```
    Hello Student
    ```
* **Target concept:** String concatenation.

---

### Exercise 11: If-Else Statement

* **Problem Statement:** Write a Java program (in a `main` method) that declares an integer variable `temperature` and sets its value to 25. Use an `if-else` statement to print "It's warm!" if the temperature is greater than 20, and "It's cool." otherwise.
* **Course-book Alignment:** Unit 4, page 65
* **Sample I/O (for temperature = 25):**
    ```
    It's warm!
    ```
* **Target concept:** `if-else` statement.

---

### Exercise 12: Nested If-Else Statements

* **Problem Statement:** Write a Java program (in a `main` method) that declares two boolean variables, `isLoggedIn` set to `true` and `hasPermission` set to `false`. Use nested `if-else` statements to print "Access granted." if both variables are true, "Permission denied." if logged in but no permission, and "Please log in." if not logged in.
* **Course-book Alignment:** Unit 4, page 67
* **Sample I/O (for isLoggedIn = true, hasPermission = false):**
    ```
    Permission denied.
    ```
* **Target concept:** Nested `if-else` statements.

---

### Exercise 13: For Loop

* **Problem Statement:** Write a Java program (in a `main` method) that uses a `for` loop to print the numbers from 1 to 5 (inclusive).
* **Course-book Alignment:** Unit 4, page 71
* **Sample I/O:**
    ```
    1
    2
    3
    4
    5
    ```
* **Target concept:** `for` loop.

---

### Exercise 14: While Loop

* **Problem Statement:** Write a Java program (in a `main` method) that uses a `while` loop to print the numbers from 5 down to 1 (inclusive).
* **Course-book Alignment:** Unit 4, page 70
* **Sample I/O:**
    ```
    5
    4
    3
    2
    1
    ```
* **Target concept:** `while` loop.

---

### Exercise 15: Do-While Loop

* **Problem Statement:** Write a Java program (in a `main` method) that uses a `do-while` loop to print the numbers from 10 down to 8 (inclusive).
* **Course-book Alignment:** Unit 4, page 70
* **Sample I/O:**
    ```
    10
    9
    8
    ```
* **Target concept:** `do-while` loop.

---

### Exercise 16: Private Visibility Modifier for Attributes

* **Problem Statement:** Modify the `Dog` class again. Ensure the `name` and `age` attributes are declared with the `private` visibility modifier. Explain in a comment why this is good practice (referencing the concept of data encapsulation).
* **Course-book Alignment:** Unit 4, page 75
* **Target concept:** `private` visibility modifier for attributes.

---

### Exercise 17: Public Visibility Modifier for Methods

* **Problem Statement:** Modify the `Dog` class. Ensure the `bark()` and `sleep()` methods are declared with the `public` visibility modifier so they can be accessed from the `Kennel` class.
* **Course-book Alignment:** Unit 4, page 75
* **Target concept:** `public` visibility modifier for methods.

---

### Exercise 18: Standard Constructor

* **Problem Statement:** Add a default (standard) constructor to the `Dog` class. Inside this constructor, initialize the `age` attribute to 0 and the `name` attribute to "Unnamed". In your `Kennel` class's `main` method, create a `Dog` object using this constructor and print its initial name and age (you will need to add getter methods for this, or temporarily change visibility for testing).
* **Course-book Alignment:** Unit 7, page 104
* **Target concept:** Standard constructors.

---

### Exercise 19: Overloading Constructors

* **Problem Statement:** Add a second constructor to the `Dog` class that takes a `String` parameter for the name and an `int` parameter for the age. This constructor should initialize the `name` and `age` attributes with the provided values. In your `Kennel` class's `main` method, create a second `Dog` object using this overloaded constructor with sample values and print its name and age.
* **Course-book Alignment:** Unit 7, page 107
* **Target concept:** Overloaded constructors.

---

### Exercise 20: Exception Handling with Try-Catch

* **Problem Statement:** Write a Java program (in a `main` method) that attempts to divide an integer by zero. Use a `try-catch` block to catch the `ArithmeticException` that occurs and print an informative error message instead of letting the program crash.
* **Course-book Alignment:** Unit 8, page 119
* **Sample I/O:**
    ```
    An error occurred: Division by zero is not allowed.
    ```
* **Target concept:** Exception handling (`try-catch`).

---

These exercises cover fundamental concepts and should be a valuable resource for your exam preparation. Remember to consult the specified sections in your course book if you need a refresher on any of the topics. Good luck with your studies!
