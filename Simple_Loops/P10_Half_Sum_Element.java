import java.util.Scanner;

public class P10_Half_Sum_Element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
            sum += currentNumber;

        }
        if (sum - maxNumber == maxNumber) {
            System.out.println("yes sum = " + maxNumber);
        } else {
            System.out.println("no diff = " + Math.abs(sum - maxNumber - maxNumber));
        }
    }
}
