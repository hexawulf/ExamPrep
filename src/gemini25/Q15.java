package gemini25;
//Exercise 15: Creating a Package
//Create a package named com.mycompany.animals and place the Dog class within it.
//
//Course-book alignment: Unit 4, Section 4.5 (Page 73)    
//Target concept: Packages
public class Q15
{

	public static void main(String[] args)
	{
		System.out.println("Package: " + dev.hexawulf.animals.Dog.class.getPackage().getName());
		System.out.println("Class: " + dev.hexawulf.animals.Dog.class.getSimpleName());

	}

}
