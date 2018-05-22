import java.util.Scanner;

public class P8_Triangle_Area_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.valueOf(scan.nextLine());
        double h = Double.valueOf(scan.nextLine());

        System.out.printf("Triagle area = %.2f", a * h/2);
    }
}
