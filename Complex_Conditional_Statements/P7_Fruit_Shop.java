import java.util.Scanner;

public class P7_Fruit_Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0;

        if (day.equals("Monday") || (day.equals("Tuesday") || (day.equals("Wednesday") ||
                (day.equals("Thursday") || (day.equals("Friday")))))) {
            if (product.equals("apple")) {
                price = 1.2;
            } else if (product.equals("banana")) {
                price = 2.50;
            } else if (product.equals("orange")) {
                price = 0.85;
            } else if (product.equals("grapefruit")) {
                price = 1.45;
            } else if (product.equals("kiwi")) {
                price = 2.70;
            } else if (product.equals("pineapple")) {
                price = 5.50;
            } else if (product.equals("grapes")) {
                price = 3.85;
            }
        } else if (day.equals("Saturday") || (day.equals("Sunday"))) {
            if (product.equals("apple")) {
                price = 1.25;
            } else if (product.equals("banana")) {
                price = 2.70;
            } else if (product.equals("orange")) {
                price = 0.90;
            } else if (product.equals("grapefruit")) {
                price = 1.60;
            } else if (product.equals("kiwi")) {
                price = 3.00;
            } else if (product.equals("pineapple")) {
                price = 5.60;
            } else if (product.equals("grapes")) {
                price = 4.20;
            }
        }
        if (price == 0) {
            System.out.println("error");
        } else {
            double result = quantity * price;
            System.out.println(result);
        }
    }
}


