package claudeAI2;

public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super("The entered age is invalid!");
    }

    public InvalidAgeException(String message) {
        super(message);  // Call Exception constructor with custom message
    }
}
