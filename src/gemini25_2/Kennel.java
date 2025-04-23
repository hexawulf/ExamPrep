package gemini25_2;

public class Kennel {

public static void main(String[] args) {

Dog puppy4 = new Dog();
puppy4.bark();
puppy4.sleep();

Dog puppy7 = new Dog();
String pupName = puppy7.getName();
int pupAge = puppy7.getAge();
System.out.println(puppy7.toString());
System.out.println("Puppy7's name: " + pupName);
System.out.println("Puppy7's age: " + pupAge);
Dog puppy9 = new Dog("0xWulf", 54);
System.out.println("The new dog is called: " + puppy9.getName() + " and its age is: " + puppy9.getAge() + ".");

}
}