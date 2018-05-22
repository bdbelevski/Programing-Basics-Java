import java.util.Scanner;

public class P4_Greater_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.valueOf(scan.nextLine());
        int b = Integer.valueOf(scan.nextLine());
        if ( a > b ) {
            System.out.println("Greater number: " + a);
        } else {
            System.out.println("Greater number: " + b);
        }
    }
}
