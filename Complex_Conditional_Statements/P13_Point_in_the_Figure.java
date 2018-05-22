import java.util.Scanner;

public class P13_Point_in_the_Figure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        if ((x >= 0 && x <= h * 3 && y >= 0 && y <= h) || (x >= h && x <= h * 2 && y >= h && y <= h * 4)) {
            if ((x > 0 && x < h * 3 && y > 0 && y < h) || (x > h && x < h * 2 && y > h && y < h * 4))
                System.out.println("inside");
            else {
                if (x > h && x < h * 2 && y == h)
                    System.out.println("inside");
                else
                    System.out.println("border");
            }
        } else
            System.out.println("outside");
    }
}


