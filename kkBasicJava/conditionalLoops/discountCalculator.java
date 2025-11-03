package conditionalLoops;

import java.util.Scanner;

public class discountCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter product price: ");
        double price = sc.nextDouble();

        System.out.print("enter dicount percentage: ");
        double dicountPct = sc.nextDouble();
        sc.close();

        double dicountAmt = price * (dicountPct / 100.0);
        double finalPrice = price - dicountAmt;

        System.out.printf("Dicount Amount = %.2f%n", dicountAmt);
        System.out.printf("Final Amount = %.2f%n", finalPrice);
    }
}