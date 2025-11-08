import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        // System.out.println("ENTER THE N NATURAL NUMBERS BY USEING FOR LOOP");
        // System.out.print("Enter the n natural number = ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int num = 1 ; num <= n; num++){
        //     System.out.println(num);
        // }
        // sc.close();
    

    //  System.out.println("ENTER THE SUM OF THE N NATURAL NUMBERS BY USEING FOR LOOP");
    //     System.out.print("Enter the n natural number = ");
    //     Scanner sc = new Scanner(System.in);
    //     int sum = 0;
    //     int n = sc.nextInt();
    //     for(int num = 1 ; num <= n; num++){
    //         sum = sum + num;
    //     }System.out.println("The sum of n natural numbers is = " + sum);
    //     sc.close();




    System.out.println("ENTER THE N NATURAL NUMBERS IN REVERSE ORDER BY USEING FOR LOOP");
    System.out.print("Enter the n natural number = ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int num = n ; num >= 1; num-=2){ // num-=2 is num = num - 2
        System.out.println(num);
    }
    sc.close();


    }
    }

