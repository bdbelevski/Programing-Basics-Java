import java.util.Scanner;

public class P9_Celsius_to_Fahrenheit_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius = Double.parseDouble(scan.nextLine());
        double Fahrenheit = celsius * 1.8 + 32;
        System.out.printf("%.2f", Fahrenheit);
    }
}
