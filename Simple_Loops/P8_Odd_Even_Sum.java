import java.util.Scanner;

public class P8_Odd_Even_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < count; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            if(i % 2 == 0){
                evenSum += currentNumber;
            }else{
                oddSum += currentNumber;
            }
        }
        if(oddSum == evenSum){
            System.out.printf("Yes\nSum = %d", evenSum);
        }else{
            System.out.printf("No\nDiff = %d", Math.abs(evenSum - oddSum));
        }
    }
}
