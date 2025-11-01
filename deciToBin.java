import java.util.Scanner;

public class deciToBin {
    
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a decimal number(n): ");

            int n = sc.nextInt();
            String binary = "";

            while (n > 0){
                int rem = n % 2;
                binary = rem + binary;
                n = n/2;
            }
            
            System.out.println("Binary number: " + binary);
            sc.close();
        }
    
}