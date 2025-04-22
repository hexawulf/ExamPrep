package chatGPT;

public class Q03
{
//	3. Leap Year Checker
//	Topic: if statements
//	Task: Check if a given year is a leap year.
//	Input: 2000
//	Output: Leap year
//	Target Concept: Nested conditionals and boolean logic.
	
		public static void main(String[] args) {
			int year = 2000;
			// Call the static method
			if (isLeapYear(year)) {
				System.out.println(year + " is a leap year.");
			} else {
				System.out.println(year + " is not a leap year.");
			}
			
			
//			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//				System.out.println(year + " is a leap year.");
//			} else {
//				System.out.println(year + " is not a leap year.");
//			}
		} // end of main
		// Static method to check leap year
		public static boolean isLeapYear(int year) 
		{
		
			return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);	
		}
		
		
		
		} // end of class




