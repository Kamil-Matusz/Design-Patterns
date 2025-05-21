package singleton.ATM;

public class ATM {

    public ATM(int deposit, int withdraw) {
        Debit buffer = Debit.getInstance();

        if (deposit > 0) {
            buffer.deposit(deposit);
        }
        if (withdraw > 0) {
            buffer.withdraw(withdraw);
        }
    }

    public static void main(String[] args) {
        new ATM(200, 0);
        new ATM(0, 100);
        new ATM(0, 700);
        new ATM(150, 0);
        new ATM(0, 600);
    }
}
