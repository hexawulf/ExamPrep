package claudeAI;
//Exercise 9: Arrays
//Target Concept: Array declaration and manipulation
//Write a method that takes an array of integers as input and returns the smallest and largest elements as a new array of size 2.

public class Q09 {
    public int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Q09 utils = new Q09();
        int[] inputArray = {3, 5, 1, 8, 2, 9};
        int[] result = utils.findMinMax(inputArray);

        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }
}
