import java.util.Scanner;

public class P14_Time_plus_15_Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        if (minutes >= 45) {
            hours = hours + 1;
            minutes = (minutes + 15) - 60;
            if (hours == 24) {
                hours = 0;
            }
            if (minutes < 10) {
                System.out.println(hours + ":0" + minutes);
            } else {
                System.out.println(hours + ":" + minutes);
            }
        } else {
            minutes += 15;
            System.out.println(hours + ":" + minutes);
        }
    }
}
