package gemini25;
//Exercise 8: Using Relational Operators
//Declare two integer variables and use relational operators (<,>,<=,>=,==,!=) to compare them. Print the boolean results.
//
//Course-book alignment: Unit 4, Section 4.3 (Page 60)    
//Target concept: Relational operators


public class Q08
{

	public static void main(String[] args)
	{
		int num1,num2;
		boolean result;

		num1 =10;
		num2=5;

		result = (num1  < num2);
		System.out.println(result);

		result = (num1 > num2);
		System.out.println(result);

		result = (num1 <= num2);
		System.out.println(result);

		result = (num1 >= num2);
		System.out.println(result);

		result = (num1 == num2);
		System.out.println(result);

		result = (num1 != num2);
		System.out.println(result);


	}

}
