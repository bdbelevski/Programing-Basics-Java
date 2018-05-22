import java.util.Scanner;

public class P6_Square_of_Stars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //Правим цикъл While с проверка за n да е 2 ≤ N ≤100
        while (!(2 <= n && n <= 100)) {
            n = scan.nextInt();
        }
        String star = new String(new char[n]).replace("\0", "*");
        String space = new String(new char[n - 2]).replace("\0", " ");
        //Принтираме квадрата
        for (int i = 1; i <= n; i++) {
            //правим проверка дали отпечатваме не-"капак" или не-"дъно"
            if (!(i == 1 || i == n)) {
                System.out.println("*" + space + "*");
            } else {
                System.out.println(star);
            }
        }
    }
}
