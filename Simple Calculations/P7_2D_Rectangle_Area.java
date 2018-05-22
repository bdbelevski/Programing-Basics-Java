import java.util.Scanner;

public class P7_2D_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double width = Math.max(x1, x2) - Math.min(x1, x2);
        double height = Math.max(y1, y2) - Math.min(y1, y2);

        System.out.printf("Area = %f\n", width * height);
        System.out.printf("Perimeter = %f\n", 2 * (width + height));
    }
}
