package chatGPT;

public class Q10
{

	public static void main(String[] args)
	{
//10. Digits to Words
//Topic: while loop + switch
//Task: Convert digits of a number into words.
//Input: 321
//Output: three two one
//Target Concept: Loop and character processing.
		int num = 321;
		String numStr = String.valueOf(num);
		int i = 0;

		while (i < numStr.length()) {
			char digit = numStr.charAt(i);
			switch (digit) {
				case '0':
					System.out.print("zero ");
					break;
				case '1':
					System.out.print("one ");
					break;
				case '2':
					System.out.print("two ");
					break;
				case '3':
					System.out.print("three ");
					break;
				case '4':
					System.out.print("four ");
					break;
				case '5':
					System.out.print("five ");
					break;
				case '6':
					System.out.print("six ");
					break;
				case '7':
					System.out.print("seven ");
					break;
				case '8':
					System.out.print("eight ");
					break;
				case '9':
					System.out.print("nine ");
					break;
			}
			i++;
		}
		System.out.println();
	}

}
