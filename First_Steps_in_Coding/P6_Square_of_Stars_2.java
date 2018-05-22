import java.util.Scanner;

public class P6_Square_of_Stars_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = Integer.parseInt(scan.nextLine());
        System.out.println(repeatStr("*", b));

        for (int i = 1; i <= b - 2; i++) {
            System.out.println("*" + repeatStr(" ", b - 2) + "*");

        }
        System.out.println(repeatStr("*", b));
    }

    static String repeatStr(String str, int count) {
        String text = "";
        {
            for (int j = 0; j < count; j++) {
                text = text + str;
            }
        }
        return text;
    }
}

