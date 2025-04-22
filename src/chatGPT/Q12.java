package chatGPT;

import java.util.Random;

public class Q12 {

    // Constants for number range and pick count
    private static final int TOTAL_NUMBERS = 49;
    private static final int PICK_COUNT = 6;

    public static void main(String[] args) {
        // Create an array with numbers from 1 to 49
        int[] numbers = new int[TOTAL_NUMBERS];
        for (int i = 0; i < TOTAL_NUMBERS; i++) {
            numbers[i] = i + 1;
        }

        // Shuffle the array
        shuffleArray(numbers);

        // Print the first 6 numbers as the lottery draw
        System.out.print("Lottery Numbers: ");
        for (int i = 0; i < PICK_COUNT; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // Method to shuffle the array using Fisher–Yates algorithm
    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1); // 0 to i
            // Swap elements at positions i and j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
