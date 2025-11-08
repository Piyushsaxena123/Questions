import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        System.out.println("QUESTION ON IF-ELSE");
        // System.out.println("WAP TO PRINT THE VALUE IF IS EVEN AND DIVISIBLE BY 3");
        // System.out.print("ENTER THE VALUE PLS = ");
        // Scanner sc = new Scanner(System.in);
        // int val = sc.nextInt();
        // if(val % 2 == 0 && val % 3 == 0){
        //     System.out.println("EVEN AND DIVISIBLE BY 3");
        // }
        // else{
        //     System.out.println("NOT EVEN AND DIVISIBLE BY 3");
        // }
        // sc.close();


        System.out.println("WAP TO PRINT THE VALUE IS DIVISIBLE BY 3 OR 5");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE VALUE PLS = ");
        int value = sc.nextInt();
        if (value % 3 == 0 || value % 5 == 0) {
            System.out.println(" VALUE IS DIVISIBLE BY 3 OR 5");
            
        }
        else{
            System.out.println("VALUE IS NOT DIVISIBLE BY 3 OR 5");
        }
        sc.close();


    }
}
