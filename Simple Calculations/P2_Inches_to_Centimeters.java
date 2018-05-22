import java.util.Scanner;

public class P2_Inches_to_Centimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inches = Double.parseDouble(scan.nextLine());
        double centimeters = inches * 2.54;
        System.out.println(centimeters);
    }
}
