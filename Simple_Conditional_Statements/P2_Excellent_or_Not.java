import java.util.Scanner;

public class P2_Excellent_or_Not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());
        if (grade >= 5.50) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not excellent.");
        }
    }
}
