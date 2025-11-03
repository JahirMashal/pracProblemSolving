package conditionalLoops;

import java.util.Scanner;

public class sumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter an integer (0 to stop): ");
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;

        }
        sc.close();
        System.out.println("Sum of integers (excluding 0): " + sum);
    }
}
