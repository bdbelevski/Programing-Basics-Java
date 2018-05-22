import java.util.Scanner;

public class P16_Number_0_to_100_to_Text {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        if (n < 0 || n > 100) {
            //|| - или
            System.out.println("invalid number");
        } else {
            if (n == 0) {
                System.out.println("zero");
            } else if (n == 1) {
                System.out.println("one");
            } else if (n == 2) {
                System.out.println("two");
            } else if (n == 3) {
                System.out.println("three");
            } else if (n == 4) {
                System.out.println("four");
            } else if (n == 5) {
                System.out.println("five");
            } else if (n == 6) {
                System.out.println("six");
            } else if (n == 7) {
                System.out.println("seven");
            } else if (n == 8) {
                System.out.println("eight");
            } else if (n == 9) {
                System.out.println("nine");
            } else if (n == 10) {
                System.out.println("ten");
            } else if (n == 11) {
                System.out.println("eleven");
            } else if (n == 12) {
                System.out.println("twelve");
            } else if (n == 13) {
                System.out.println("thirteen");
            } else if (n == 14) {
                System.out.println("fourteen");
            } else if (n == 15) {
                System.out.println("fifteen");
            } else if (n == 16) {
                System.out.println("sixteen");
            } else if (n == 17) {
                System.out.println("seventeen");
            } else if (n == 18) {
                System.out.println("eighteen");
            } else if (n == 19) {
                System.out.println("nineteen");
            } else if (n == 20) {
                System.out.println("twenty");
            } else if (n == 100) {
                System.out.println("one hundred");
            } else {
                int desetici = n / 10;
                //намираме десетиците
                int edinici = n % 10;
                //намираме единиците
                String nameDes = "";
                String nameEd = "";

                if (desetici == 2) {
                    nameDes = "twenty";
                } else if (desetici == 3) {
                    nameDes = "thirty";
                } else if (desetici == 4) {
                    nameDes = "forty";
                } else if (desetici == 5) {
                    nameDes = "fifty";
                } else if (desetici == 6) {
                    nameDes = "sixty";
                } else if (desetici == 7) {
                    nameDes = "seventy";
                } else if (desetici == 8) {
                    nameDes = "eighty";
                } else if (desetici == 9) {
                    nameDes = "ninety";
                }
                System.out.print(nameDes);

                if (edinici == 1) {
                    nameEd = " one";
                } else if (edinici == 2) {
                    nameEd = " two";
                } else if (edinici == 3) {
                    nameEd = " three";
                } else if (edinici == 4) {
                    nameEd = " four";
                } else if (edinici == 5) {
                    nameEd = " five";
                } else if (edinici == 6) {
                    nameEd = " six";
                } else if (edinici == 7) {
                    nameEd = " seven";
                } else if (edinici == 8) {
                    nameEd = " eight";
                } else if (edinici == 9) {
                    nameEd = " nine";
                }
                System.out.print(nameEd);
            }
        }
    }
}
