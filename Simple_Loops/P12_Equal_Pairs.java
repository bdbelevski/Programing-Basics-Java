import java.util.Scanner;

public class P12_Equal_Pairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int currentSum = 0;
        int previousSum = 0;
        int maxDiff = 0;
        int currentDiff = 1;

        for (int i = 1; i <= n; i++) {
            previousSum = currentSum;
            int a = Integer.parseInt(scan.nextLine());
            int b = Integer.parseInt(scan.nextLine());
            currentSum = a + b;
            currentDiff = Math.abs(currentSum - previousSum);
            if (currentDiff > maxDiff && i >= 2) {
                maxDiff = currentDiff;
            }
        }
        if (maxDiff == 0) {
            System.out.println("Yes, value=" + currentSum);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
