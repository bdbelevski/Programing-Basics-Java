import java.util.Scanner;

public class P12_Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String isLeap = scan.nextLine();
        int holidays = scan.nextInt();
        int weekends = scan.nextInt();
        int weekendsNotHome = 48 - weekends;
        double result = ((2.0 / 3.0) * holidays) + weekends + weekendsNotHome * (3.0 / 4.0);
        double leap = 0.15 * result;

        if (isLeap.matches("leap")) {
            result += leap;
        }
        System.out.println((int) (Math.floor(result)));
    }
}

