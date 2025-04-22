package claudeAI;

public class Invoice implements Payable {

    private double invoiceAmount;

    public Invoice(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    @Override
    public double calculatePayment() {
        return invoiceAmount;
    }
}
