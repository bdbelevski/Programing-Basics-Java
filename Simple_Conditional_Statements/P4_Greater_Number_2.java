import java.util.Scanner;

public class P4_Greater_Number_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.valueOf(scan.nextLine());
        int num2 = Integer.valueOf(scan.nextLine());
        if (num1 > num2) {
            System.out.printf("Greater number: %d", num1);
        } else {
            System.out.printf("Greater number: %d", num2);
        }
    }
}
