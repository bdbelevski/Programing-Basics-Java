import java.util.Scanner;

public class P9_Vowels_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();//HELLO - дължината е 5 символа

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            switch (currentChar) {
                case 'a':
                    sum++;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
