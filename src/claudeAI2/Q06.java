package claudeAI2;
/*Exercise 6: Conditional Statement
Write a Java method called checkAge that takes an integer parameter representing a person's age and returns a String. If the age is less than 18, return "Minor". If the age is between 18 and 65 (inclusive), return "Adult". If the age is greater than 65, return "Senior".
Target concept: Conditional branching with if-else statements (Unit 4, Section 4.4, pp. 64-69)*/


public class Q06
{
 public static void main(String[] args)
 {
  

String c1 = checkAge(18);
System.out.println(c1);
String c2 = checkAge(10);
System.out.println(c2);
String c3 = checkAge(70);
System.out.println(c3);
	 
	 
	 
} // end of psvm

 
 public static String checkAge(int age) {
	
	if (age <18) {
	return "Minor";}
	else if (age >=18 && age <=65)
	return "Adult";
	else {return "Senior";}
	}
 
 
} //end of class Q06

 
