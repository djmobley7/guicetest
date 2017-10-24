public class PaypalCreditCardProcessor implements CreditCardProcessor {
    @Override
    public void process() {
        System.out.println("Processing payment via Paypal!");
    }
}
