import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        System.out.println("If-Else & Ternary operators in java");
        Scanner sc = new Scanner(System.in);
        
        //  System.out.print("Enter the value of n = ");
        //  int n = sc.nextInt() ;
        // if(  n%2 ==0){
        //     System.out.println("The number is = EVEN");
        // }
        // else{
        //     System.out.println("The number is = ODD");
        // }
        // sc.close();
      

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt() ;
        String ans ;
        ans = (n%2==0) ? "Even" : "Odd";
        System.out.println("The number " + n + " is " + ans);
        sc.close();

    }
}
