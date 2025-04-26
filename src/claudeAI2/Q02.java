package claudeAI2;

/*Exercise 2: Getter and Setter Methods
Extend the Customer class below by adding getter and setter methods for each attribute. Follow proper Java naming conventions.
javapublic class Customer {
    private String firstName;
    private String lastName;
    private String email;
}
Target concept: Implementing getter and setter methods (Unit 3, Section 3.4, pp. 44-50)*/


public class Q02
{
public static void main(String[] args) {
	
	Customer c = new Customer();
	c.setFirstName("Wulf");
	c.setLastName("Werewolf");
	c.setEmail("null");
	System.out.println(c);
	
	
}
}
