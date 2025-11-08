import java.util.Scanner;

public class practiceloop1 {
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number of digits = ");
    // int n = sc.nextInt();
    // int num = 0;
    // int original_num = n;
    // int sum = 0;
    
    // while(n > 0){
    //     sum = sum + n % 10;
    //     n = n / 10;
      
    //     num++;
    // }
    // System.out.println("Number of digits in " + num + " = " + original_num);
    // System.out.println("Sum of digits in " + num + " = " + sum);
    // }



    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the number = ");
    //     int n = sc.nextInt();
    //     int ans = 0;
    //     while(n > 0){
    //         ans = ans * 10 + n % 10 ;
    //         n /= 10;
    //     }
    //     System.out.println("Reversed number = " + ans);
    // }

    // public static void main(String[] args){
    //     Scanner  sc = new Scanner(System.in);
    //     System.out.print("Enter the value of n = ");
    //     int n = sc.nextInt();
    //     int ans = 0;
    //     for(int i = 1 ; i <= n; i++){
    //         if(i % 2 == 0){
    //             ans -= i;
    //         }
    //         else{
    //             ans += i;
    //         }
    //     } System.out.println("Final result = " + ans);
    // }



    // Factorial of Numbers ==>>
//    public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the value of n = ");
//     int n = sc.nextInt();
//     int fact = 1;
    
//     for(int i = 1; i<=n; i++){
//       fact = fact * i;
     
//       System.out.println("Factorial of " + i + " = " + fact + ".");
        
//     }
    
//    }



public static void main(String[] args){
// Power of 2 number a and b 
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of a = ");
int a = sc.nextInt();
System.out.print("Enter the value of b = ");
int b = sc.nextInt();
int Power = 1;
for(int i = 1; i<= b; i++){
    Power = Power * a;

} System.out.print("The final result = "+Power);
    
   }


}
