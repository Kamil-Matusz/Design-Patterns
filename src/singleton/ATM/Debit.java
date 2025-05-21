package singleton.ATM;

public class Debit {

    private static volatile Debit instance;
    private static final int OVERDRAFT_LIMIT = -500;
    private int balance = 0;

    private Debit() {}

    public static Debit getInstance() {
        if (instance == null) {
            synchronized (Debit.class) {
                if (instance == null) {
                    instance = new Debit();
                }
            }
        }
        return instance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " PLN, Balance: " + balance + " PLN");
    }

    public void withdraw(int amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " PLN, Balance: " + balance + " PLN");
        } else {
            System.out.println("Withdrawal denied: overdraft limit exceeded (" + OVERDRAFT_LIMIT + " PLN)");
        }
    }
}
