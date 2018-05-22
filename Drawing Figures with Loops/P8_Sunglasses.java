import java.util.Scanner;

public class P8_Sunglasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String row1 = repeatStr("*", 2 * n)
                + repeatStr(" ", n)
                + repeatStr("*", 2 * n);

        System.out.println(row1);

        for (int row = 0; row < n - 2; row++) {
            String row2 = repeatStr("*", 1)
                    + repeatStr("/", 2 * n - 2)
                    + repeatStr("*", 1);

            if (row == (n - 1) / 2 - 1) {
                row2 += repeatStr("|", n);
            } else {
                row2 += repeatStr(" ", n);
            }
            row2 += repeatStr("*", 1)
                    + repeatStr("/", 2 * n - 2)
                    + repeatStr("*", 1);

            String currentRow2 = row2;

            System.out.println(currentRow2);
        }
        System.out.println(row1);
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
