import java.util.Scanner;

public class P5_Square_Frame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String firstAndLastRow = "+";

        for (int col = 0; col < n - 2; col++) {
            firstAndLastRow += " -";//отпечатваме + - -
        }
        firstAndLastRow += " +";
        System.out.println(firstAndLastRow);

        String middleRows = "|";
        for (int i = 0; i < n - 2; i++) {
            middleRows += " -";
        }
        middleRows += " |";
        for (int i = 0; i < n - 2; i++) {
            System.out.println(middleRows);
        }
        System.out.println(firstAndLastRow);
    }
}
