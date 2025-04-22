package claudeAI;

public class InsufficientFundsException extends Exception {

    // ⚠️  Add this constant – problem solved
    private static final long serialVersionUID = 1L;

    public InsufficientFundsException() {
        super("Insufficient Funds!");
    }
}
