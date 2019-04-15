import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> transactions = new ArrayList<Double>();

        int accountNumber = 122118;
        int PIN = 214;
        boolean account = false;
        boolean pin = false;
        double balance = 0;
        int accTries = 0;
        int pinTries = 0;
        
        while (!account) {
            System.out.println("Please enter account number to continue:");
            int inputAN = scanner.nextInt();
            if (accountNumber == inputAN){
                System.out.println("Access Granted" + "\n" + "\n");
                account = true;
            } else {
                System.out.println("Access Denied" + "\n");
                accTries++;
            }
            if (accTries == 3) {
                System.out.print("You have exceeded your tries, please come back later");
                break;
            }
        }

        while (!pin && account){
            System.out.println("Please enter pin to continue:");
            int inputP = scanner.nextInt();
            if (PIN == inputP){
                System.out.println("Access Granted" + "\n" + "\n");
                pin = true;
            } else {
                System.out.println("Access Denied" + "\n");
                pinTries++;
            }
            if (pinTries == 3){
                System.out.print("You have exceeded your tries, please come back later");
                break;
            }
        }

        while (account && pin){
            System.out.println("Choose an operation" + "\n" + "1. Deposit" + "\n" + "2. Withdraw" + "\n" + "3. Check Balance" + "\n" + "4. Transaction History" + "\n" + "5. Log Out");
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice){
                case 1:
                    System.out.println("How much would you like to deposit?");
                    double deposit = scanner.nextDouble();
                    balance = balance + deposit;
                    transactions.add(deposit);
                    System.out.println("$" + deposit + " has been added to your account" + "\n" + "You have $" + balance + " left in your account" + "\n");
                    break;

                case 2:
                    System.out.println("How much would you like to withdraw?");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > balance){
                        System.out.println("Your account does not contain that amount" + "\n" + "You have $" + balance + " in your account" + "\n");
                    } else {
                    balance = balance - withdraw;
                    transactions.add(-withdraw);
                    System.out.println("$" + withdraw + " has been removed from your account" + "\n" + "You have $" + balance + " left in your account" + "\n");
                    }
                    break;

                case 3:
                    System.out.println("You have $" + balance + " left in your account" + "\n");
                    break;

                case 4:
                    for (int i = 0; i < transactions.size(); i++){
                        System.out.println(transactions.get(i));
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Thank you for your business");
                    scanner.close();
                    account = false;
                    break;
            }
        }
    }
}