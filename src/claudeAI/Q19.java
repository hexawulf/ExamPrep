package claudeAI;
//Exercise 19: String Manipulation
//Target Concept: String operations
//Write a method that takes a String parameter and returns:
//
//The number of characters in the string
//The string in all uppercase
//The string with all spaces removed
//
//Return these as an array of objects.


public class Q19 {

    public static Object[] analyzeString(String input) {
        int length = input.length();
        String upper = input.toUpperCase();
        String noSpaces = input.replace(" ", "");

        return new Object[] { length, upper, noSpaces };
    }

    public static void main(String[] args) {
        String test = "Hello Wulf";

        Object[] result = analyzeString(test);

        System.out.println("Length: " + result[0]);
        System.out.println("Uppercase: " + result[1]);
        System.out.println("No spaces: " + result[2]);
    }
}
