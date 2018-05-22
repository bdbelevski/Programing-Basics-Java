import java.util.Scanner;

public class P2_Numbers_Ending_in_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 7; i < 1000; i += 10) {
            if (i % 10 == 7) {//взима последната цифра
                System.out.println(i);
            }
        }
    }
}
