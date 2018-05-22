import java.util.Scanner;

public class P6_Min_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());

            if(currentNumber < minNumber){
                minNumber = currentNumber;
            }
        }
        System.out.println(minNumber);
    }
}

