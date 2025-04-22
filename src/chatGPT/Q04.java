package chatGPT;

public class Q04
{
//4. Maximum of Three Numbers
//Topic: Conditional branching (if-else)
//Task: Read three integers and output the largest.
//Input: 3, 5, 1
//Output: Maximum is 5
//Target Concept: Multi-branch decision making.
	
		public static void main(String[] args) {
			int num1 = 3;
			int num2 = 5;
			int num3 = 1;

			int max;

			if (num1 >= num2 && num1 >= num3) {
				max = num1;
			} else if (num2 >= num1 && num2 >= num3) {
				max = num2;
			} else {
				max = num3;
			}

			System.out.println("Maximum is " + max);
		}
	}


