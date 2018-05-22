import java.util.Scanner;

public class P2_Rectangle_of_NxN_Stars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
