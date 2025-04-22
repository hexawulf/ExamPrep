package abacusAI;

public class Student {
	private String name;
	// Constructor to initialize the name field
	public Student(String name) {
	this.name = name;}
    // Getter for the name field
    public String getName() {
        return name;
	}
    // Setter for the name field
    public void setName(String name) { 
		this.name = name;
	}
	// Override toString() method for better representation instead of default Object.toString(), which would look like Person@hashcode
  @Override
  public String toString() {
      return "Student{name='" + name + "'}";
	  }
}