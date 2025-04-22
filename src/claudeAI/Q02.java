package claudeAI;
//Exercise 2: Getters and Setters
//Target Concept: Encapsulation with getter and setter methods
//Create a class Student with private attributes: name (String), id (int), and gpa (double). Implement appropriate getter and setter methods for each attribute.
public class Q02
{
public class Student
{
	String name;
	int id;
	double gpa;	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
}
}