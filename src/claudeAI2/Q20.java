package claudeAI2;
/*
Exercise 20: Interfaces
Create an interface called Comparable with a method called compareTo that takes an Object parameter and returns an integer. Implement this interface in a class called Person with a name attribute, where the compareTo method compares persons based on their names alphabetically.
Target concept: Interfaces and interface implementation (Unit 9, Section 9.2, pp. 133-137)*/

public class Q20
{

	public static void main(String[] args)
	{
		Person p1 = new Person("Alice");
        Person p2 = new Person("Bob");

        System.out.println(p1.compareTo(p2));  // Should print a negative number ("Alice" before "Bob")
        System.out.println(p2.compareTo(p1));  // Should print a positive number ("Bob" after "Alice")
        System.out.println(p1.compareTo(p1));  // Should print 0 (same person)

	}

}
