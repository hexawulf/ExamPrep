package gemini25;

public class Dog

{
	
	private String name; // Name of the dog
	private int age; // Age of the dog
	
	
	//getter and setter methods
	
		public String getDogName() {
		    return name;}
		    
		public void setDogName(String name) {
				  this.name = name;
				  }
		
		public int getDogAge() {
		    return age;}
		public void setDogAge(int age) {
				  this.age = age;
					  }
	
	// Constructors
		public Dog (String name, int age) {
			this.name = name;
			this.age = age;
			}
		
		public Dog () {
			this.name = "Unknown";
			this.age = 0;
			}
			
		
	
@Override
	public String toString()
	{
	 return "Dog{name='" + name + "', age=" + age + "}";
	}
}
