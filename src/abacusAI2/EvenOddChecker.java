package abacusAI2;

public class EvenOddChecker {

    public String checkEven(int num1) {
        if (num1 % 2 == 0) {
            return num1 + " is even.";
        } else {
            return num1 + " is odd.";
        }
    }
}
