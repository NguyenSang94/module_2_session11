package session11_kha2;

public class main {
    static void main() {
        Payment[] payments = new Payment[3];
        payments[0] = new CashPayment(100000);
        payments[1] = new CreditCardPayment(250000);
        payments[2] = new EWalletPayment(500000);

        for (Payment p : payments) {
            p.pay();

            if (p instanceof Refundable) {
                ((Refundable) p).refund();
            }
        }
    }

}

