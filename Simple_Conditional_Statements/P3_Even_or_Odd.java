import java.util.Scanner;

public class P3_Even_or_Odd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());

        if (number % 2 != 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}
