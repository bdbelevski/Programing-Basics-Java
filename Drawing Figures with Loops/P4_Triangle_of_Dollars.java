import java.util.Scanner;

public class P4_Triangle_of_Dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int row = 0; row < n; row++) {
            System.out.print("$");
            for (int col = 0; col < row; col++) {
                System.out.print(" $");
            }
            System.out.println();
        }
    }
}
