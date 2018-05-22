import java.util.Scanner;

public class P7_Left_and_Right_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int left = 0;
        int right = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            left += currentNumber;
        }
        for (int j = 0; j < n; j++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            right += currentNumber;
        }
        if (left == right) {
            System.out.println("Yes, sum = " + left);
        } else {
            System.out.println("No, diff = " + Math.abs(right - left));
        }
    }
}
