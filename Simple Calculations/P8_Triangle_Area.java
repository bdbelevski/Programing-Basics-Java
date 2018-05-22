import java.util.Scanner;

public class P8_Triangle_Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double h = scan.nextDouble();
        scan.nextLine();
        double area = calculateTriangleArea(a, h);
        print(area);
    }
    private static void print(double area){
        System.out.printf("Triangle area = %.2f", area);
    }
    private static double calculateTriangleArea(double a, double h) {
        return (a * h / 2);
    }
}
