import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int num = 1;
        // System.out.print("Enter the number = ");
        // int n = sc.nextInt();
        // while(num <= n){
        //     System.out.println(num);
        //     num++;
        // }
        // sc.close();





        System.out.println("THE SUM OF FIRST N NATURAL NUMBERS WHERE N IS THE INPUT ");
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int sum = 0;
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        while(num <= n){
          
            num++;
            sum =sum + num;
        }System.out.println("THe sum of n natural numbers is = " + sum);
        sc.close();

    }
}
