package gemini25_2;

/*Exercise 9: Relational Operators
Write a Java program (in a main method) that declares two integer variables, score1 with a value of 85 and score2 with a value of 90. Use relational operators (==, !=, <, <=, >, >=) to compare the two scores and print the boolean result of each comparison.
Course-book Alignment: Unit 4, page 60    
Problem Statement: Compare two numbers using relational operators and print the outcomes.
Sample I/O:
score1 equals score2: false
score1 not equals score2: true
score1 is less than score2: true
score1 is less than or equal to score2: true
score1 is greater than score2: false
score1 is greater than or equal to score2: false
Target concept: Relational operators.*/
public class Q09
{

	public static void main(String[] args)
	{
		int score1, score2;
		boolean result;

		score1 = 85;
		score2 = 90;


		// score1 equals score2: false
		result = score1 == score2;
		System.out.println("score1 equals score2: " +result);

		// score1 not equals score2: true
		result = score1 != score2;
		System.out.println("score1 not equals score2: " +result);

		// score1 is less than score2: true
		result = score1 < score2;
		System.out.println("score1 is less than score2: " +result);

		// score1 is less than or equal to score2: true
		result = score1 <= score2;
		System.out.println("score1 is less than or equal to score2: " +result);

		// score1 is greater than score2: false
		result = score1 > score2;
		System.out.println("score1 is greater than score2: " +result);

		// score1 is greater than or equal to score2: false
		result = score1 >= score2;
		System.out.println("score1 is greater than or equal to score2: " +result);


	}

}
