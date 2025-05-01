package claudeAI2;
/*Exercise 10: Package Declaration
Create a Java class called Product and place it in a package named com.onlineshop.inventory. Include the appropriate package declaration at the top of the file.
Target concept: Package declaration (Unit 4, Section 4.5, pp. 73-75)*/

import dev.hexawulf.inventory.Product;

public class Q10
{

	public static void main(String[] args)
	{
		Product myProduct = new Product(); // assuming a no-args constructor exists
		System.out.println(myProduct);


	}

}
