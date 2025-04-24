package chatGPT2;

public class Dog {

		//attributes
		private String name;
		private int age;
		private String dogbreed;

		//getters & setter

		public void setName(String name) {
		this.name = name;
		}

		public void setAge(int age) {
		this.age = age;
		}

		public String getName() {
		return name;
		}

		public int getAge() {
		return age;
		}
		
		//additional methods
		
		//new setters
		public void setBreed(String dogbreed) {
			
		this.dogbreed = dogbreed;}
		

		public String getBreed() {
		return dogbreed;}
		
		
	//toString override
		@Override
		public String toString() {
		    return "Dog{" +
		           "name='" + name + '\'' +
		           ", age=" + age +
		           '}';
		}
}