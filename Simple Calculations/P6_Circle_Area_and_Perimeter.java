import java.util.Scanner;

public class P6_Circle_Area_and_Perimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = Double.parseDouble(scan.nextLine());
        double area = Math.PI * r * r;
        double perimeter = Math.PI * 2 * r;
        System.out.println(area);
        System.out.println(perimeter);
    }
}
