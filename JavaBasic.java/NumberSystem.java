import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        // BINARY NUMBER TO DECIMAL NUMBER ==>>

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a binary number: ");
        // int binary_num = sc.nextInt(); // Input binary number
        // int ans = 0; // Convert decimal number
        // int pw = 1; // Power of 2, starts at 2^0

        // while (binary_num > 0) {
        //     int unit_digit = binary_num % 10; // Get the last digit
        //     ans += (unit_digit * pw); // Add the digit times its power of 2
        //     binary_num /= 10; // Remove the last digit
        //     pw *= 2; // Move to the next power of 2
        // }

        // System.out.println("Decimal equivalent: " + ans);


        //  DECIMAL NUMBER TO  BINARY NUMBER ==>>

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number = ");
        int decimal_num = sc.nextInt();

        int ans = 0;
        int pw = 1;

        while (decimal_num > 0) {
            int parity = decimal_num % 2;
            ans = ans + (parity * pw);
            pw = pw * 10;
           decimal_num /= 2;
        }
        System.out.println("Binary number = " + ans);




    }
}
