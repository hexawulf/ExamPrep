package chatGPT;

public class Q06
{
public static void main(String[] args) {
//6. Simple Calculator
//Topic: switch statement
//Task: Read two numbers and an operator, then perform the operation.
//Input: 4, 2, *
//Output: 8
//Target Concept: switch and arithmetic operations.
	int num1 = 4;
	int num2 = 2;
	char operator = '*';
	int result;

	switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Cannot divide by zero.");
				return; // Exit if division by zero
			}
			break;
		default:
			System.out.println("Invalid operator.");
			return; // Exit if invalid operator
	}

	System.out.println("Result: " + result);
}
}
