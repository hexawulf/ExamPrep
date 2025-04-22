package chatGPT;

public class Q11
{

	public static void main(String[] args)
	{
//11. Array: Minimum and Maximum
//Topic: Arrays
//Task: Input array of integers and find min & max.
//Input: {2, 7, 1, 8}
//Output: Min: 1, Max: 8
//Target Concept: Array traversal.
		int[] numbers = {2, 7, 1, 8, 16,104};
		int min = numbers[0];
		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		System.out.println("Min: " + min + ", Max: " + max);

	}

}
