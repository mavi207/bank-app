import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Password (Password should be Length greater or equal to 8): ");
        String password = scanner.nextLine();

        while(password.length()<8){
            System.out.println();
            System.out.println("Invalid!!");
            System.out.println("Password should be Length greater or equal to 8");
            System.out.println("Enter Password: ");
            password = scanner.nextLine();
        }

        System.out.println("Enter Balance you want to add to Account: ");
        double balance = Double.parseDouble(scanner.nextLine());

        HDFCAccount Account = new HDFCAccount(name, password, balance);

        System.out.println(Account);

        System.out.println();

        while (true) {
            System.out.println("Press 1 to Fetch Balance in Account");
            System.out.println("Press 2 to Add Money in Account");
            System.out.println("Press 3 to WithDraw Money in Account");
            System.out.println("Press 4 to Change Password of Account");
            System.out.println("Press 5 to Calculate Interest");
            System.out.println("Press 6 to Transaction History");
            System.out.println("Press 0 to Exit");
            System.out.println("Select One Option");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading the option

            switch (option) {
                case 1 -> {
                    System.out.println("Enter Password of your Account: ");
                    String enteredPassword = scanner.nextLine();
                    System.out.println();
                    System.out.println(Account.fetchBalance(enteredPassword));
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Enter Amount you want to Add: ");
                    double enteredAmount = Double.parseDouble(scanner.nextLine());
                    System.out.println();
                    System.out.println(Account.addMoney(enteredAmount));
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Enter Password of your Account: ");
                    String userPassword = scanner.nextLine();
                    System.out.println("Enter Amount you want to WithDraw: ");
                    double enteredAmount = Double.parseDouble(scanner.nextLine());
                    System.out.println();
                    System.out.println(Account.withDrawMoney(enteredAmount, userPassword));
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("Enter Old Password of your Account: ");
                    String oldUserPassword = scanner.nextLine();
                    System.out.println("Enter New Password of your Account (Password should be Length greater or equal to 8): ");
                    String newUserPassword = scanner.nextLine();
                    System.out.println();
                    System.out.println(Account.changePassword(oldUserPassword, newUserPassword));
                    System.out.println();
                }
                case 5 -> {
                    System.out.println("Enter Year: ");
                    int year = scanner.nextInt();
                    System.out.println();
                    System.out.println("Interest for "+year+" Years is "+Account.calculateInterest(year));
                    System.out.println();
                }
                case 6 -> {
                    ArrayList<TransactionHistory> list=Account.getTransaction();
                    System.out.println();
                    for(int i=0;i<list.size();i++){
                        System.out.println(list.get(i).count+") "+list.get(i).type+" of amount "+list.get(i).amount+" and balance is "+list.get(i).balance);
                    }
                    System.out.println();
                    break;
                }
                case 0 -> {
                    return;
                }
            }
        }
    }
}