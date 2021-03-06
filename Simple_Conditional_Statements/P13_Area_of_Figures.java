import java.util.Scanner;

public class P13_Area_of_Figures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        double a = Double.parseDouble(scan.nextLine());

        if (type.equals("square")){
            System.out.printf("%.3f", a * a);
        }else if (type.equals("rectangle")) {
            double b = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f", a * b);
        } else if (type.equals("circle")) {
            System.out.printf("%.3f", Math.PI * a * a);
        } else if (type.equals("triangle")) {
            double h = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f", (a * h) / 2);
        }
    }
}
