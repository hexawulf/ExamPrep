package claudeAI;
//Exercise 20: Copy Constructor
//Target Concept: Copy constructors for object cloning
//Extend the Student class from Exercise 2 to include a copy constructor that creates a new Student object with the same attributes as an existing one.

public class Q20 {
    public static void main(String[] args) {
        // Original Student
        Student original = new Student("Wulf", 2025, 3.9);

        // Cloned Student using copy constructor
        Student copy = new Student(original);

        // Print original and copied values
        System.out.println("Original Student:");
        System.out.println("Name: " + original.getName());
        System.out.println("ID: " + original.getId());
        System.out.println("GPA: " + original.getGpa());

        System.out.println("\nCopied Student:");
        System.out.println("Name: " + copy.getName());
        System.out.println("ID: " + copy.getId());
        System.out.println("GPA: " + copy.getGpa());
    }
}
