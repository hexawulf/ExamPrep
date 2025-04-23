package gemini25_2;
/*Exercise 12: Nested If-Else Statements
Write a Java program (in a main method) that declares two boolean variables, isLoggedIn set to true and hasPermission set to false. Use nested if-else statements to print "Access granted." if both variables are true, "Permission denied." if logged in but no permission, and "Please log in." if not logged in.
Course-book Alignment: Unit 4, page 67    
Problem Statement: Use nested conditional statements to handle multiple conditions.
Sample I/O (for isLoggedIn = true, hasPermission = false):
Permission denied.
Target concept: Nested if-else statements.*/

public class Q12
{

	public static void main(String[] args)
	{
		boolean isLoggedIn, hasPermission;
		isLoggedIn = true;
		hasPermission = false;

		// Nested if-else statements solution
		        if (isLoggedIn) {
		            if (hasPermission) {
		                System.out.println("Access granted.");
		            } else {
		                System.out.println("Permission denied.");
		            }
		        } else {
		            System.out.println("Please log in.");
		        }
		
		
		
		
		//alternative solution
		if (isLoggedIn && hasPermission) {
		    System.out.println("Access granted.");
		} else if (isLoggedIn) {
		    System.out.println("Permission denied.");
		} else {
		    System.out.println("Please log in.");
		}


	}

}
