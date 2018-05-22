import java.util.Scanner;

public class P11_Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection = scan.nextLine();
        double r = Double.parseDouble(scan.nextLine());
        double c = Double.parseDouble(scan.nextLine());

        double turnover = 0.0;

        if ("Premiere".equals(projection)) {
            turnover = 12 * r * c;
            System.out.printf("%.2f", turnover);

        } else if ("Normal".equals(projection)) {
            turnover = 7.5 * r * c;
            System.out.printf("%.2f", turnover);

        } else if("Discount".equals(projection)) {
            turnover = 5 * r * c;
            System.out.printf("%.2f", turnover);
        }
    }
}
