import java.util.Scanner;

public class P15_3_Equal_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        int number3 = Integer.parseInt(scan.nextLine());

        if (number1 == number2 && number2 == number3) {
            System.out.println("yes");
        } else System.out.println("no");
    }
}
