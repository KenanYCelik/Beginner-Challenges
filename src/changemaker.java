import java.util.Scanner;

public class changemaker {
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.println("Enter a dollar amount to find the amound of change needed.");
        double total = scanner.nextDouble() * 100;
        double quarters = Math.floor(total / 25);

        double new_Total = total - (quarters * 25);
        double dimes = Math.floor(new_Total / 10);

        new_Total = new_Total - (dimes * 10);
        double nickels = Math.floor(new_Total / 5);

        new_Total = new_Total - (nickels * 5);
        double pennies = Math.floor(new_Total / 1);

        new_Total = new_Total - pennies;
        if (new_Total == 0){
            System.out.println(quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies");
        }
    }
}
