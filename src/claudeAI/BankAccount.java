package claudeAI;

public class BankAccount {
    private double accountBalance;

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Deposited: " + amount + ", New balance: " + accountBalance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrew: " + amount + ", Remaining balance: " + accountBalance);
        } else {
            throw new InsufficientFundsException();
        }
    }

    public double getBalance() {
        return accountBalance;
    }
}
