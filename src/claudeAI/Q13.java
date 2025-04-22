package claudeAI;
//Exercise 13: Static Elements
//Target Concept: Static attributes and methods
//Create a class Counter with a static attribute count that keeps track of how many instances of the class have been created. Include a constructor that increments the count and a static method getCount() that returns the current count.



public class Q13
{

	public static void main(String[] args)
	{
		Counter count = new Counter();
		Counter count2 = new Counter();
		Counter count3 = new Counter();
		Counter count4 = new Counter();
		Counter count5 = new Counter();
		System.out.println("Number of instances created: " + Counter.getCount());
		// TODO Auto-generated method stub

	}

}
