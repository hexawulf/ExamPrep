package claudeAI;
//Exercise 10: Basic Inheritance
//Target Concept: Class inheritance
//Create a superclass Vehicle with attributes brand (String) and year (int). Then create a subclass Car that inherits from Vehicle and adds an attribute model (String). Include appropriate constructors and getter methods.

public class Q10 //Target concept: Inheritance
{
		public static void main(String[] args) {
	        Car myCar = new Car("Mazda", 2022, "CX-5");

	        System.out.println(myCar.getBrand()); // from Vehicle
	        System.out.println(myCar.getYear());  // from Vehicle
	        System.out.println(myCar.getModel()); // from Car
	    }
	}

