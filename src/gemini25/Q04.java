package gemini25;
//Exercise 4: Implementing Setter Methods
//For the Dog class, add public setter methods setName(String name) and setAge(int age) to modify the name and age attributes.
//
//Course-book alignment: Unit 3, Section 3.4 (Page 44)    
//Target concept: Setter methods




public class Q04
{
public static void main(String[] args)
{
	Dog doggie = new Dog();
	doggie.setDogName("0xWulf");
	doggie.setDogAge(54);
	System.out.println("Dog's name: " + doggie.getDogName());
	System.out.println("Dog's age: " + doggie.getDogAge());
	System.out.println(doggie); // Print the Dog object
} //end of psvm
}// end of class