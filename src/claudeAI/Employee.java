package claudeAI;

public class Employee implements Payable {

    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePayment() {
        return salary;
    }
}
