package gemini25_2;
//Exercise 1: Defining a Basic Class
//
//Create a simple Java class named Dog. This class should represent a dog with no specific properties or behaviors yet.
//
//Course-book Alignment: Unit 3, page 41    
//Problem Statement: Define an empty class named Dog.
//Target concept: Basic class definition.

public class Dog
{
	//attributes set to private, so they cannot be accessed directly from outside the class: encapsulation
	private String name; 
	private int age;
	
	
	//default constructor
	public Dog() {
		this.name = "Unnamed";
		this.age = 0;
		}

		//getter methods for Dog class
		public String getName() {
		  return name;
		}

		public int getAge() {
		  return age;
		}
	
	//overloaded constructor
		public Dog(String name, int age) {
			this.name = name;
			this.age = age;
			}
	
	
	//methods set to public, so they can be accessed from outside the class
		public void bark() {
		System.out.println("Woof!");
		}

		public void sleep() {
		System.out.println("Zzzzz..."); 
		}

	
	
	
	
		@Override
		public String toString() {
		    return "Dog{name='" + name + "', age=" + age + "}";
		}

}
