import java.util.Scanner;

public class P6_Bonus_Score {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double score = Double.parseDouble(scan.nextLine());
        double bonus = 0;

        if (score <= 100) {
            bonus = bonus + 5;

        } else if (score <= 1000) {
            bonus += 0.2 * score;
        } else {
            bonus += 0.1 * score;
        }
        if (score % 2 == 0) {
            //проверка за четно число
            bonus += 1;
        } else if (score % 10 == 5) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(bonus + score);
    }
}
