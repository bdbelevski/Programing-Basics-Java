import java.util.Scanner;

public class P7_Sum_Seconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p1Seconds = Integer.parseInt(scan.nextLine());
        int p2Seconds = Integer.parseInt(scan.nextLine());
        int p3Seconds = Integer.parseInt(scan.nextLine());
        int totalSeconds = p1Seconds + p2Seconds + p3Seconds;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        if (seconds < 10) {
            System.out.println(minutes + ":0" + seconds);
        } else {
            System.out.println(minutes + ":" + seconds);
        }
    }
}
