package conditionalLoops;

import java.util.Scanner;

public class tsaoCube {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate total surface area of cube: ");

        double a = sc.nextDouble();
        //  if (a < 0) {
        //     System.out.println("Side length cannot be negative.");
        //     sc.close();
        //     return;
        // }

        double surfaceArea = 6 * a * a;
        System.out.println("The total surface area of the cube is: " + surfaceArea);
        sc.close();
        
    }
}