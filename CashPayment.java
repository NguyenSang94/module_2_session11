package session11_kha2;

public class CashPayment extends Payment {


    public CashPayment(int amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Thanh toán bằng tiền mặt");
        printAmount();
    }
}
