package abacusAI;

public class Q11
{
//	11. Switch Statement
//	Problem:
//	Write a program that prints the day of the week based on an integer (1 for Monday, 2 for Tuesday, etc.) using a switch statement.
//
//	Example Input:
//	3
//	Example Output:
//	Wednesday
//
//	Targeted Concept:
//	Switch Statements – Using switch for multi-way branching.
	
	
	public static void main(String[] args)
	{
		int day = 3; // Example input
		String dayName;

		switch (day) {
			case 1:
				dayName = "Monday";
				break;
			case 2:
				dayName = "Tuesday";
				break;
			case 3:
				dayName = "Wednesday";
				break;
			case 4:
				dayName = "Thursday";
				break;
			case 5:
				dayName = "Friday";
				break;
			case 6:
				dayName = "Saturday";
				break;
			case 7:
				dayName = "Sunday";
				break;
			default:
				dayName = "Invalid day";
		}

		System.out.println(dayName);
	}
}
