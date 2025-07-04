package strategyDP;

public class StrategyDesignPattern {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService(new CreditCardPayment());
        paymentService.checkout(250.00);

        paymentService.setStrategy(new PayPalPayment());
        paymentService.checkout(450.00);

        paymentService.setStrategy(new UpiPayment());
        paymentService.checkout(450.00);
    }
}
