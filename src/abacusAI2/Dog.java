package abacusAI2;

public class Dog extends Animal {

public String makeSound() {
return "Woof Woof!";
}
@Override
public String toString() {
    return "Dog makes sound: " + makeSound();
}
}