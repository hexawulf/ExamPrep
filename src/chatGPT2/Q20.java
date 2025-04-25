package chatGPT2;

/*20. Exception Handling
Problem: Write a method that divides two integers and throws an exception if the denominator is zero.
Course-book alignment: Unit 8.1–8.3 (Exception Handling)
Target concept: Try-catch block and custom exception*/
public class Q20
{

	public static void main(String[] args)
	{
		// testing the divMethod
        try {
            double result1 = divMethod(10, 0);  // This will throw exception
            System.out.println(result1);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            double result2 = divMethod(10, 2);  // This will work
            System.out.println(result2);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }


	} // end of psvm


public static double divMethod(int num1, int num2) throws ArithmeticException {
    if (num2 == 0) {
        throw new ArithmeticException("Calculation not possible - Division by zero detected!");
    }
    return (double) num1 / num2;
}

}  // end of Q20 class


// This would have worked too 
//public static double divMethod(int num1, int num2) throws ArithmeticException {
//return num1 / num2;
//}
