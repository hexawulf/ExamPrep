package claudeAI;
//Exercise 18: Polymorphism
//Target Concept: Polymorphism through inheritance
//Create a superclass Animal with a method makeSound(). Create subclasses Dog, Cat, and Cow that override the method. Write a method animalSound that takes an Animal 
public class Q18 {
    public static void animalSound(Animal animal) {
        System.out.println(animal.makeSound());
    }

    public static void main(String[] args) {
        Animal zoo1 = new Dog();
        Animal zoo2 = new Cat();
        Animal zoo3 = new Cow();

        animalSound(zoo1);
        animalSound(zoo2);
        animalSound(zoo3);
    }
}
