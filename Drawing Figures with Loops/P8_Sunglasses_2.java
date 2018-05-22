import java.util.Scanner;

public class P8_Sunglasses_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String firsAndLastRow = repeatStr("*", 2 * n)
                + repeatStr(" ", n)
                + repeatStr("*", 2 * n);
        System.out.println(firsAndLastRow);

        for (int row = 0; row < n - 2; row++) {
            String middleRow = "*" + repeatStr("/", 2 * n - 2) + "*";
            if (row == (n - 1) / 2 - 1) {
                middleRow += repeatStr("|", n);
            } else {
                middleRow += repeatStr(" ", n);
            }
            middleRow += repeatStr("*", 1)
                    + repeatStr("/", 2 * n - 2)
                    + repeatStr("*", 1);

            String currentRow2 = middleRow;
            System.out.println(currentRow2);
        }

        System.out.println(firsAndLastRow);
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}

