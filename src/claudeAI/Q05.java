package claudeAI;
//Exercise 5: Primitive Data Types
//Target Concept: Understanding and using primitive data types
//Write a program that declares variables for each primitive data type in Java (byte, short, int, long, float, double, char, boolean). Assign appropriate values to each and print them.


public class Q05 {
    int id;
    byte age;
    short height;
    long phoneNumber;
    float salary;
    double balance;
    char initial;
    boolean isActive;

    public static void main(String[] args) {
        Q05 myObject = new Q05(); // Create an instance of the Q05 class
        myObject.id = 12345;
        myObject.age = 25;
        myObject.height = 175;
        myObject.phoneNumber = 1234567890L;
        myObject.salary = 50000.50f;
        myObject.balance = 1000.75;
        myObject.initial = 'A';
        myObject.isActive = true;

        System.out.println("ID: " + myObject.id);
        System.out.println("Age: " + myObject.age);
        System.out.println("Height: " + myObject.height);
        System.out.println("Phone Number: " + myObject.phoneNumber);
        System.out.println("Salary: " + myObject.salary);
        System.out.println("Balance: " + myObject.balance);
        System.out.println("Initial: " + myObject.initial);
        System.out.println("Is Active: " + myObject.isActive);
    }
}
