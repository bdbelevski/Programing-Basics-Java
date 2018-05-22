import java.util.Scanner;

public class P5_Invalid_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        if (num != 0 && !(num >= 100 && num <= 200)) {
            System.out.println("invalid");
        }
    }
}

