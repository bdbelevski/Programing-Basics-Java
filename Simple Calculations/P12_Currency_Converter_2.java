import java.util.Scanner;

public class P12_Currency_Converter_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double cash = Double.parseDouble(scan.nextLine());
        String startingCurrency = scan.nextLine().toUpperCase();
        String convertToCurrency = scan.nextLine().toUpperCase();

        if (startingCurrency.equals("BGN")){
            cash = cash * 1;
        } else if (startingCurrency.equals("USD")) {
            cash = cash * 1.79549;
        } else if (startingCurrency.equals("EUR")) {
            cash = cash * 1.95583;
        } else if (startingCurrency.equals("GBP")) {
            cash = cash * 2.53405;
        }
        if (convertToCurrency.equals("BGN")){
            cash = cash / 1;
        } else if (convertToCurrency.equals("USD")) {
            cash = cash / 1.79549;
        } else if (convertToCurrency.equals("EUR")) {
            cash = cash / 1.95583;
        } else if (convertToCurrency.equals("GBP")) {
            cash = cash / 2.53405;
        }
        System.out.printf("%.2f, %s", cash, convertToCurrency);
    }
}
