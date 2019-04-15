import java.util.Scanner;

public class Login{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "got_em";
        boolean loop = true;
    
        while (loop){
            System.out.println("Please enter username to continue:");
            String input = scanner.next();
            if (username.equalsIgnoreCase(input)){
                System.out.println("Access Granted" + "\n" + "Welcome back " + username);
                loop = false;
                scanner.close();
            } else {
            System.out.println("Access Denied" + "\n");
            }
        }
    }
}