import java.util.Scanner;

public class P5_Max_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        System.out.println(maxNumber);
    }
}

