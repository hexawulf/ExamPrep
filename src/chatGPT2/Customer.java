package chatGPT2;

public class Customer {


	//attributes
	private String name;
	private int age;

	//getter & setter methods

	public String getName() {
	    return name;
	} 

	public void setName(String name) {
	this.name = name;
	}

	public int getAge() {
	    return age;
	} 

	public void setAge(int age) {
	this.age = age;
	}


	public Customer() {
	this(null, 0);
	}

	public Customer(String name, int age) {

	this.name = name;
	this.age = age;
	}

	@Override
	public String toString() {
	  return "Customer with { " + name + " , " +age + " } created.";}
}