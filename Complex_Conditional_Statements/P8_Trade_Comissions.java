import java.util.Scanner;

public class P8_Trade_Comissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());

        double commission = 0.0;

        if (city.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                commission = 0.05;
            } else if (sales > 500 && sales <= 1000) {
                commission = 0.07;
            } else if (sales > 1000 && sales < 10000) {
                commission = 0.08;
            } else if (sales > 10000) {
                commission = 0.12;
            }
        } else if (city.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                commission = 0.045;
            } else if (sales > 500 && sales <= 1000) {
                commission = 0.075;
            } else if (sales > 1000 && sales < 10000) {
                commission = 0.1;
            } else if (sales > 10000) {
                commission = 0.13;
            }
        } else if (city.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                commission = 0.055;
            } else if (sales > 500 && sales <= 1000) {
                commission = 0.08;
            } else if (sales > 1000 && sales < 10000) {
                commission = 0.12;
            } else if (sales > 10000) {
                commission = 0.145;
            }
        }
        if (!city.equals("Sofia") && !city.equals("Varna") && !city.equals("Plovdiv")
                || sales < 0) {
            System.out.println("error");
        } else {
            double result = sales * commission;
            System.out.printf("%.2f", result);
        }
    }
}

