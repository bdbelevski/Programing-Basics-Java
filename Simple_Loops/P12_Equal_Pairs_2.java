import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class P12_Equal_Pairs_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // >0

        double prevSum = 0;
        double maxDiff = -Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            double temp1 = Double.parseDouble(sc.nextLine());
            double temp2 = Double.parseDouble(sc.nextLine());

            double sum = temp1 + temp2;
            //arrSums[i] = temp1 + temp2;
            if ((i == 0) && (n == 1)) {
                maxDiff = 0;
                prevSum = sum;
            }
            if (i == 0) {
                prevSum = sum;
                continue;
            }
            double diff = Math.abs(prevSum - sum);
            if (diff > maxDiff) {
                maxDiff = diff;
            }
            prevSum = sum;
        }
        DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        df.setMaximumFractionDigits(340); //340 = DecimalFormat.DOUBLE_FRACTION_DIGITS

        if (maxDiff == 0) {
            System.out.println("Yes, value=" + df.format(prevSum));
        } else {
            System.out.println("No, maxdiff=" + df.format(maxDiff));
        }
    }
}

