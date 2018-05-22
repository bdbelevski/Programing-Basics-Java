import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P13_1000_Days_After_Birth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String bDay = scan.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        int add_days = 999;
        LocalDate birthDay = LocalDate.parse(bDay, dateFormat).plusDays(add_days);

        System.out.println(dateFormat.format(birthDay));
    }
}
