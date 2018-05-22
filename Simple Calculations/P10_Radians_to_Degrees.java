import java.util.Scanner;

public class P10_Radians_to_Degrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rad = Double.parseDouble(scan.nextLine());
        double deg = Math.toDegrees(rad);

        System.out.printf("deg = %.0f", deg);
    }
}
