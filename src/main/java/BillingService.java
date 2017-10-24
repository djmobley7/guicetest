import com.google.inject.Inject;

public class BillingService {
    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;

    @Inject
    public BillingService(CreditCardProcessor processor,
                          TransactionLog transactionLog){
        this.processor = processor;
        this.transactionLog = transactionLog;
    }

    public void chargeOrder() {
        processor.process();
    }
}
