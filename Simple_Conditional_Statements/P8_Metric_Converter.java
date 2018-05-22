import java.util.Scanner;

public class P8_Metric_Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double size = Double.parseDouble(scan.nextLine());
        String sourceMetric = scan.nextLine();
        String destMetric = scan.nextLine();

        //конвертираме входа
        if ("mm".equals(sourceMetric)) {
            size /= 1000;
        } else if ("cm".equals(sourceMetric)) {
            size /= 100;
        } else if ("km".equals(sourceMetric)) {
            size /= 0.001;
        } else if ("mi".equals(sourceMetric)) {
            size /= 0.000621371192;
        } else if ("in".equals(sourceMetric)) {
            size /= 39.3700787;
        } else if ("ft".equals(sourceMetric)) {
            size /= 3.2808399;
        } else if ("yd".equals(sourceMetric)) {
            size /= 1.0936133;
        }
        //конвертираме изхода
        if ("mm".equals(destMetric)) {
            size *= 1000;
        } else if ("cm".equals(destMetric)) {
            size *= 100;
        } else if ("mi".equals(destMetric)) {
            size *= 0.000621371192;
        } else if ("in".equals(destMetric)) {
            size *= 39.3700787;
        } else if ("ft".equals(destMetric)) {
            size *= 3.2808399;
        } else if ("yd".equals(destMetric)) {
            size *= 1.0936133;
        } else if ("km".equals(destMetric)) {
            size *= 0.001;
        }
        System.out.printf("%.8f %s", size, destMetric);
    }
}
