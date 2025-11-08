import java.util.Scanner;

public class practiceloop {
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     int num = 1;

    //     while(num <= n){
    //         System.out.println(num);
    //         num++; // Incerment operator
    //     }


    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the value of n natural number = ");
    //     int n = sc.nextInt(); // 5
    //     int num = 1;
    //     int sum = 0;
    //     while(num<=n){ // 1<=5 , 2<=5 , 3<=5 , 4<=5 , 5<=5 ,6<=5(Not)
           
    //         sum = sum + num; // 0 + 1 , sum = 1 + 2 = 3 ,sum = 3+num(3) = 6, sum = 6+num(4) = 10 , sum = 9+5=15
    //         System.out.println("Sum after adding " + num + ": " + sum); // 1 3 6 9 14
    //         num++; // 1+1=2 ,2+1= 3 , 3+1 = 4, 4+1 = 5,5+1 = 6
    //     }
    //     System.out.println("Final result of addition = " + sum);
    //     sc.close();
    // }




// // SUM OF N NATURAL NUMBERS BY USING FOR LOOPS
// public static void main(String[]args){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int sum = 0;
// for(int num = 1; num<=n; num++){
// sum = sum + num;
// }
// System.out.println(sum);
// sc.close();
// }


// SUM OF N NATURAL NUMBERS BY USING FOR LOOPS IN REVERSE ORDER
// public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the value of n = ");
//     int n = sc.nextInt();
    
    
//     for(int num = n; num>=1; num--){ // num-=2
//         System.out.println(num);
//     }
    
//     sc.close();
//     }
    


public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value pls = ");
    int num = sc.nextInt();
    int sum = 0;
   while(num != -1){
     sum = sum + num;
     System.out.print("Enter the another value pls = ");
     num = sc.nextInt();
   }
   System.out.println("The Final Sum of all the numbers : " + sum);

}




}
