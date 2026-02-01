import java.util.Scanner;

public class AgeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age in years: ");
        int years = sc.nextInt();

        int months = years * 12;
        int days = years * 365;
        int hours = days * 24;

        System.out.println("Months = " + months);
        System.out.println("Days = " + days);
        System.out.println("Hours = " + hours);
    }
}
