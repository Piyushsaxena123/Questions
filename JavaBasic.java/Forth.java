import java.util.Scanner;

public class Forth {
    public static void main(String[] args) {
        System.out.println("TAKING INPUT FROM USER = SCANNER");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int num_1 = sc.nextInt();
        System.out.print("Enter the Second number = ");
        int num_2 = sc.nextInt();
        int sum = num_1 + num_2;
        System.out.println("The sum of two numbers = " + sum);

    }
}
