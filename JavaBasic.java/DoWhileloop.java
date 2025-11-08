
import java.util.Scanner;
public class DoWhileloop {
    public static void main(String[] args) {
        System.out.println("ENTER THE N NATURAL NUMBERS UPTO 100 ");
        Scanner sc = new Scanner(System.in);
        int num = 20;
        System.out.print("ENTER THE N NATURAL NUMBERS = ");
        int n = sc.nextInt();
        do{
            System.out.println(num);
            num++;
        }
        while(num >= n);
        sc.close();

    }
}
