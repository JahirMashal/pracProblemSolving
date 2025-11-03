package conditionalLoops;

import java.util.Scanner;

public class averageOFNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers (N)? ");
        int n = sc.nextInt();

        double sum = 0.0;

        for (int i = 1; i<= n; i++){
            System.out.println("Enter number " + i + ": ");
            sum += sc.nextDouble();

        }
        sc.close();

        double avg = sum / n ;
        System.out.printf("Average = %.4f%n " , avg);

        
    }
}
