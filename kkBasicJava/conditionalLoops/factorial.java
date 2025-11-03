package conditionalLoops;

import java.util.Scanner;
import java.math.BigInteger;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: " );
        int num = sc.nextInt();

        BigInteger fact = BigInteger.ONE;
        for(int i = 2; i <= num; i++){
            fact = fact.multiply(BigInteger.valueOf(i));

        }
        System.out.println(num + " != "  + fact);
        sc.close();
    }
}
