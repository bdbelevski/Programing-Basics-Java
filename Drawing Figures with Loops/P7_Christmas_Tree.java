import java.util.Scanner;

public class P7_Christmas_Tree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int row = 0; row < n+1; row++) {
            String spaces = repeatStr(" ", n-row);
            String stars = repeatStr("*",row);
            String currentRow = spaces + stars + " | " + stars;
            System.out.println(currentRow);
        }
//създавеме си метод
    }static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
