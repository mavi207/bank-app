import java.util.HashMap;

public class TransactionHistory {
    int count;
    String type;

    double amount;

    double balance;

    public TransactionHistory(int count, String type, double amount, double balance) {
        this.count = count;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
    }
}
