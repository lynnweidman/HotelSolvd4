package enums;

public enum PaymentGreeting {
    CASH("We are grateful for your cash payment."),
    CREDIT_CARD("We are grateful for your credit card payment.");

    private String paymentGreeting;

    PaymentGreeting(String paymentGreeting) {
        this.paymentGreeting = paymentGreeting;
    }

    public String getPaymentGreeting() {
        return paymentGreeting;
    }

    public void setPaymentGreeting(String paymentGreeting) {
        this.paymentGreeting = paymentGreeting;
    }
}
