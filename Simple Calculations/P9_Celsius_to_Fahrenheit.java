import java.util.Scanner;

public class P9_Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius = Double.valueOf(scan.nextLine());
        System.out.printf("%.2f", celsius * 1.8 + 32);
    }
}
