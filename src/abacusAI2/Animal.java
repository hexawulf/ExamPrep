package abacusAI2;

public class Animal {

public String makeSound() {
return "Animal makes default sound";
}
@Override
public String toString() {
	return "Animal{" +
			"sound='" + makeSound() + '\'' +
			'}';
}
}

