package conditionalLoops;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed : ");
        double units = sc.nextDouble();
        sc.close();

        if (units < 0) {
            System.out.println("Units cannot be negative.");
            return;
        }

        double r1 = 1.50;
        double r2 = 2.50;
        double r3 = 4.00;
        double r4 = 6.00;
        double fixed = 50.0;


        // double bill = fixed;
        // double remaining = units;

        // double use = Math.min(remaining, 100); bill += use * r1; remaining -= use;
        // if (remaining > 0) { use = Math.min(remaining, 100); bill += use * r2; remaining -= use; }
        // if (remaining > 0) { use = Math.min(remaining, 300); bill += use * r3; remaining -= use; }
        // if (remaining > 0) { bill += remaining * r4; }

        // System.out.printf("Total Bill = %.2f (includes fixed charge %.2f)%n", bill, fixed);

        double used1 = Math.min(units, 100);
        double remaining = units - used1;

        double used2 = 0, used3 = 0, used4 = 0;

        if (remaining > 0) {
            used2 = Math.min(remaining, 200);
            remaining -= used2;
            
        }
        if (remaining > 0) {
            used3 = Math.min(remaining, 300);
            remaining -= used3;
            
        }
        if (remaining > 0) {
            used4 = remaining;
            
        }

        double charge1 = used1 * r1;
        double charge2 = used2 * r2;
        double charge3 = used3 * r3;
        double charge4 = used4 * r4;

        double energyCharges = charge1 + charge2 + charge3 + charge4;
        double totalBill = fixed + energyCharges;

        System.out.println("\n-----Electricity Bill----");
        System.out.printf("Units Consumed: %.2f kWh%n", units);
        System.out.printf("Fixed Charge: ₹%.2f%n", fixed);
        if (used1 > 0) System.out.printf("0–100 @ ₹%.2f: ₹%.2f%n", r1, charge1);
        if (used2 > 0) System.out.printf("101–200 @ ₹%.2f: ₹%.2f%n", r2, charge2);
        if (used3 > 0) System.out.printf("201–500 @ ₹%.2f: ₹%.2f%n", r3, charge3);
        if (used4 > 0) System.out.printf(">500 @ ₹%.2f: ₹%.2f%n", r4, charge4);
        System.out.printf("Energy Charges: ₹%.2f%n", energyCharges);
        System.out.printf("Total Bill: ₹%.2f%n", totalBill);

    }
}
