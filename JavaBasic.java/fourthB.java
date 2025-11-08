import java.util.Scanner;
public class fourthB {
    public static void main(String[] args) {
        System.out.println("Taking input from String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = sc.nextLine();
        System.out.println("Your name is = "+ name);
        sc.close();
        
    }
}
