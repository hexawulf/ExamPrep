package gemini25;
//Exercise 14: Using a do-while Loop
//Write a program that uses a do-while loop to print numbers from 5 to 1.
//
//Course-book alignment: Unit 4, Section 4.4 (Page 72)    
//Target concept: do-while loop


public class Q14
{

	public static void main(String[] args)
	{
		int index =5;
		do { 
		  System.out.print(index + " ");
		  index--;
		  } while (index >=1);

	}

}
