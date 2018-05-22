import java.util.Scanner;

public class P11_Equal_Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();

        if (word1.toLowerCase().equals(word2.toLowerCase())) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
