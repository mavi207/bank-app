import java.util.ArrayList;

public interface BankAccountInterface {

    String fetchBalance(String password);
    // this will take password to check validity of user and then return the current balance

    String addMoney(double amount);
    // this method will add money in account
    // double is used because money can be in double

    String withDrawMoney(double amount, String password);
    // this method will withdraw amount from account by validating the password provided
    // if amount is greater than balance operation will be rejected

    String changePassword(String oldPassowrd, String newPassword);
    // this method will change password of account by validating the old password

    double calculateInterest(int year);

    void recordTransaction(String type,double amount);

    ArrayList<TransactionHistory> getTransaction();
}
