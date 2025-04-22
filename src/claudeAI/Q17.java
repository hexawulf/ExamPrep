package claudeAI;
//Exercise 17: Interfaces
//Target Concept: Interfaces and implementation
//Create an interface called Payable with a method calculatePayment(). Then create two classes Employee and Invoice that implement this interface.

public class Q17 {
    public static void main(String[] args) {

        // Create Employee and Invoice instances
        Payable employee = new Employee(1200.00);
        Payable invoice = new Invoice(450.00);

        // Display payments
        System.out.println("Employee payment: $" + employee.calculatePayment());
        System.out.println("Invoice payment: $" + invoice.calculatePayment());
    }
}
