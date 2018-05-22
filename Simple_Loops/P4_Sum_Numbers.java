import java.util.Scanner;

public class P4_Sum_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberCount = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = 0; i < numberCount; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            sum += currentNumber;
        }
        System.out.println(sum);
    }
}

