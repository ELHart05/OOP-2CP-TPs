public class ServicePayment implements ServiceI {
    private int PaymentID;
    private double Amount;

    public ServicePayment(int PaymentID, double Amount) {
        this.PaymentID = PaymentID;
        this.Amount = Amount;
    }

    public void Feedback() {
        System.out.println("Payment Service Feedback");
    }

    public void setPaymentID(int paymentID) {
        PaymentID = paymentID;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public int getPaymentID() {
        return PaymentID;
    }

    public double getAmount() {
        return Amount;
    }
}
