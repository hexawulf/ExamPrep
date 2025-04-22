package claudeAI;
//Exercise 6: Conditional Statements
//Target Concept: if-else branches and decision-making
//Write a method called checkGrade that takes an integer parameter representing a score and returns a letter grade according to the following scale:
//
//90-100: 'A'
//80-89: 'B'
//70-79: 'C'
//60-69: 'D'
//Below 60: 'F'

public class Q06 {
        // This method takes an integer parameter 'marks' and returns a character grade based on the value of 'marks'.
    public char getGrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            System.out.println("Your grade is an A. Congratulations");
            return 'A';
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Your grade is a B.");
            return 'B';
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Your grade is a C.");
            return 'C';
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Your grade is a D.");
            return 'D';
        } else {
            System.out.println("Your grade is an F. More luck next time!");
            return 'F';
        }
    }

    	public static void main(String[] args) {
        Q06 grader = new Q06(); // Create an instance of the Q06 class
        char grade1 = grader.getGrade(95);   // Call the getGrade method with marks 95
        System.out.println("Returned grade: " + grade1); // Print the returned grade

        char grade2 = grader.getGrade(78);   // Call the getGrade method with marks 78
        System.out.println("Returned grade: " + grade2); // Print the returned grade

        char grade3 = grader.getGrade(55);   // Call the getGrade method with marks 55
        System.out.println("Returned grade: " + grade3); // Print the returned grade
    }
}
