import java.util.Scanner;

public class P5_Trapeziod_Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double b1 = Double.parseDouble(scan.nextLine());
        double b2 = Double.parseDouble(scan.nextLine());
        double h = Double.valueOf(scan.nextLine());
        double s = (b1 + b2) * h / 2;
        System.out.println(s);
    }
}
