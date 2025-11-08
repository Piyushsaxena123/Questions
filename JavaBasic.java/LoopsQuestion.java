import java.util.Scanner;
public class LoopsQuestion {
 public static void main(String[] args) {
    // System.out.println("Print the Sum of the Stream of Integers in the input");
    // System.out.print("Enter the number = ");
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();
    // int sum = 0;
    // while(num != 0){
    //     sum += num;
    //     System.out.print("+");
    //     num = sc.nextInt();
    // }System.out.print("Sum of the numbers = " + sum);




    System.out.println("Print the Sum of the Stream of Integers in the input");
    System.out.print("Enter the number  pls = ");
    Scanner sc= new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
  
    do{
       
        sum += num;
        System.out.println("+");
        num = sc.nextInt();
       
    }while(num != 0);
    System.out.print("Sum of the numbers = " + sum);

 }
}









// import java.util.Scanner;
// public class LoopsQuestion {
//  public static void main(String[] args) {
//     System.out.println("Print the Sum of the Stream of Integers in the input");
//     System.out.print("Enter the number = ");
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     int sum = 0;
//     while(num != -1){
//         sum += num;
//         System.out.print("+");
//         num = sc.nextInt();
//     }System.out.print("Sum of the numbers = " + sum);

//  }
// }
