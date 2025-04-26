package claudeAI2;
/*Exercise 17: Copy Constructor
Create a class called Student with attributes for name, id, and gpa. Implement a regular constructor and a copy constructor that creates a new Student object with the same attributes as an existing Student object.
Target concept: Copy constructor (Unit 7, Section 7.2, pp. 111-112)*/


public class Q17
{
	public static void main(String[] args)
	{
		Student s1 = new Student("John Doe", "123456", 3.5);
		Student s2 = new Student(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}