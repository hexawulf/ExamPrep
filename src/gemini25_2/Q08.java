package gemini25_2;
/*Exercise 8: Logical Operators
Write a Java program (in a main method) that declares two boolean variables, isJavaFun set to true and isExamSoon set to true. Use logical operators (&&, ||, !) to evaluate and print the results of the following expressions: isJavaFun AND isExamSoon, isJavaFun OR isExamSoon, and NOT isJavaFun.
Course-book Alignment: Unit 4, page 60    
Problem Statement: Use logical operators to combine and negate boolean values.
Sample I/O:
Both are true: true
At least one is true: true
isJavaFun is not true: false
Target concept: Logical operators.*/


public class Q08
{

	public static void main(String[] args)
	{
		boolean isJavaFun;
		boolean isExamSoon;
		boolean result;

		isJavaFun = true;
		isExamSoon = true;

		// isJavaFun AND isExamSoon
		result = isJavaFun && isExamSoon; 
		System.out.println("isJavaFun AND isExamSoon evaluates to: " +result);

		//isJavaFun OR isExamSoon
		result = isJavaFun || isExamSoon;
		System.out.println("isJavaFun OR isExamSoon evaluates to: " +result);

		// NOT isJavaFun.
		result = !isJavaFun;
		System.out.println("NOT isJavaFun evaluates to: " +result);

	}

}
