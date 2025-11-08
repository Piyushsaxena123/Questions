import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
        System.out.println("WAP TO READ CHARACTER BY USING SCANNER CLASS");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character = ");
        char ch = sc.next().charAt(2);
        System.out.println("The character is = " + ch);
        sc.close();



    }
}
