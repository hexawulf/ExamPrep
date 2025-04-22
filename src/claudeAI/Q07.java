package claudeAI;
//Exercise 7: Loops
//Target Concept: For loops for repetitive tasks
//Write a method that takes an integer parameter n and prints a multiplication table for that number from 1 to 10. For example, if n = 5, it should print:
//5 x 1 = 5
//5 x 2 = 10
//...
//5 x 10 = 50


public class Q07
{
	//For Loop Exercise
	public static void main(String[] args)
	{
		
		Q07 q = new Q07();
		q.forLoop(5); // Call the forLoop method with 5 as an argument
	}
	    public void forLoop(int n) {
	        for (int i = 1; i <= 10; i++) { // Loop from 1 to 10
	            System.out.println(n + " x " + i + " = " + (n * i));
	        }
}
}