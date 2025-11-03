package conditionalLoops;

import java.util.Scanner;

public class largestUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long max = Integer.MIN_VALUE;
        
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number > max) {
                max = number;
            }
        }
        if (max == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number entered is: " + max);
        }
        sc.close();
    }
}
