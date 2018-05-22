import java.util.Scanner;

public class P10_Animal_Type {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String animal = scan.nextLine();

        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
            case "tortoise":
            case "crocodile":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
