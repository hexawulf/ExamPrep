package claudeAI;
//Exercise 16: Custom Exceptions
//Target Concept: Creating user-defined exceptions
//Create a custom exception called InsufficientFundsException. Then create a BankAccount class with methods deposit and withdraw where the withdraw method throws the custom exception if the withdrawal amount exceeds the balance.


public class Q16 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(100.0);  // ✅ Deposit works

        try {
            account.withdraw(30.0);  // ✅ Within balance
            account.withdraw(90.0);  // ❌ Should trigger custom exception
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
