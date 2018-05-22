import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_Odd_or_Even_Position {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        int n = Integer.parseInt(scan.nextLine());//брой числа

        double OddSum = 0;
        double EvenSum = 0;
        double OddMin = 1000000000.0;
        double OddMax = -1000000000.0;
        double EvenMin = 1000000000.0;
        double EvenMax = -1000000000.0;

        for (int i = 1; i <= n; i++) {

            double number = Double.parseDouble(scan.nextLine());

            if (i % 2 == 1) {
                OddSum += number;
                if (OddMin > number) {
                    OddMin = number;
                }
                if (OddMax < number) {
                    OddMax = number;
                }
            }
            if (i % 2 == 0) {
                EvenSum += number;
                if (EvenMin > number) {
                    EvenMin = number;
                }
                if (EvenMax < number) {
                    EvenMax = number;
                }
            }
        }
        if (n == 1) {
            System.out.println("OddSum=" + df.format(OddSum) + ",");
            System.out.println("OddMin=" + df.format(OddMin) + ",");
            System.out.println("OddMax=" + df.format(OddMax) + ",");
            System.out.println("EvenSum=" + df.format(EvenSum) + ",");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else if (n == 0) {
            System.out.println("OddSum=" + df.format(OddSum) + ",");
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.println("EvenSum=" + df.format(EvenSum) + ",");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }
        System.out.println("OddSum=" + df.format(OddSum) + ",");
        System.out.println("OddMin=" + df.format(OddMin) + ",");
        System.out.println("OddMax=" + df.format(OddMax) + ",");
        System.out.println("EvenSum=" + df.format(EvenSum) + ",");
        System.out.println("EvenMin=" + df.format(EvenMin) + ",");
        System.out.println("EvenMax=" + df.format(EvenMax));
    }
}
