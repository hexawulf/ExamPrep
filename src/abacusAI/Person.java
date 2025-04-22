package abacusAI;

public class Person {
	private String name;
	// Constructor to initialize the name field
	public Person(String name) {
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
      return "Person{name='" + name + "'}";
    
}}