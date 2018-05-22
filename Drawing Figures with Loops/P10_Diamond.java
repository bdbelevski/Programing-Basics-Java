import java.util.Scanner;

public class P10_Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        if (n % 2 != 0) {
            for (int i = 0; i <= n / 2; i++) {
                if (i != 0) {
                    System.out.println(repeatStr("-", n / 2 - i)
                            + repeatStr("*", 1)
                            + repeatStr("-", 2 * i - 1)
                            + repeatStr("*", 1)
                            + repeatStr("-", n / 2 - i));
                } else {
                    System.out.println(repeatStr("-", n / 2 - i)
                            + repeatStr("*", 1)
                            + repeatStr("-", 2 * i - 1)
                            + repeatStr("-", n / 2 - i));
                }
            }
            for (int i = (n - 1) / 2; i > 0 / 2; i--) {
                if (i != 1) {
                    System.out.println(repeatStr("-", n / 2 - i + 1)
                            + repeatStr("*", 1)
                            + repeatStr("-", 2 * i - 3)
                            + repeatStr("*", 1)
                            + repeatStr("-", n / 2 - i + 1));
                } else {
                    System.out.println(repeatStr("-", n / 2 - i + 1)
                            + repeatStr("*", 1)
                            + repeatStr("-", 2 * i - 3)
                            + repeatStr("-", n / 2 - i + 1));
                }
            }
        } else {
            for (int i = 0; i <= n / 2 - 1; i++) {
                System.out.println(repeatStr("-", n / 2 - 1 - i)
                        + repeatStr("*", 1)
                        + repeatStr("-", 2 * i)
                        + repeatStr("*", 1)
                        + repeatStr("-", n / 2 - 1 - i));
            }
            for (int i = (n - 1) / 2; i > 0; i--) {
                System.out.println(repeatStr("-", n / 2 - i)
                        + repeatStr("*", 1)
                        + repeatStr("-", 2 * (i - 1))
                        + repeatStr("*", 1)
                        + repeatStr("-", n / 2 - i));
            }

        }

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
