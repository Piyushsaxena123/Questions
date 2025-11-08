import java.util.Scanner;

public class fourthprogram {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for input and store the inputs
        System.out.print("Enter the first number = ");
        int num_a = sc.nextInt();
        
        System.out.print("Enter the second number = ");
        int num_b = sc.nextInt();

        int sum = num_a + num_b;

        // Close the Scanner object
        sc.close();
        
        System.out.println("ADDITION OF TWO NUMBERS ARE = " + sum);
    }
}
