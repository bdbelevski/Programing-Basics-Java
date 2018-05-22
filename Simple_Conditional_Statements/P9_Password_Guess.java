import java.util.Scanner;

public class P9_Password_Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        if ("s3cr3t!P@ssw0rd".equals(password)) {
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }
    }
}
