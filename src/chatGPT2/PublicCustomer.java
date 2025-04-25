package chatGPT2;
//make the class attributes public for exercise 16

public class PublicCustomer {


	//attributes
	public String name;
	public int age;

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


	public PublicCustomer() {
	this(null, 0);
	}

	public PublicCustomer(String name, int age) {

	this.name = name;
	this.age = age;
	}

	@Override
	public String toString() {
	  return "Customer with { " + name + " , " +age + " } created.";}
}