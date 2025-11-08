import java.util.Scanner;

public class Loopsnesting {
    public static void main(String[] agrs) {

        // for(int i = 1; i<=3 ; i++){
        // for(int j = 1; j<=3; j++){
        // System.out.println(i + "," + j);
        // }
        // System.out.println();
        // }

        // PATTERN PRINTING IN LOOPS (RECTANGLE)
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of Rows = ");
        // int r = sc.nextInt();
        // System.out.print("Enter the value of Columns = ");
        // int c = sc.nextInt();
        // for(i3nt i = 1; i<=r ; i++){
        // for(int j = 1; j<=c; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // HOLLOW RECTANGLE

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of Rows = ");
        // int r = sc.nextInt();
        // System.out.print("Enter the value of Columns = ");
        // int c = sc.nextInt();
        // for(int i = 1; i<=r ; i++){
        // for(int j = 1; j<=c; j++){
        // if(i == 1 || i == r || j == 1 || j == c){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // TRINGLE PATTERN

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of Rows = ");
        // int r = sc.nextInt();

        // for(int i = 1; i<=r ; i++){
        // for(int j = 1; j<=i; j++){

        // System.out.print("*");

        // }
        // System.out.println();
        // }

        // INVERTED TRINGLE PATTERN (1)

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of Rows = ");
        // int r = sc.nextInt();

        // for(int i = 1; i<=r ; i++){
        // for(int j = 1; j<=(r+1-i); j++){

        // System.out.print("*");

        // }
        // System.out.println();
        // }

        // INVERTED TRINGLE PATTERN (2)

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of Rows = ");
        // int r = sc.nextInt();

        // for(int i = r; i>=1 ; i--){
        // for(int j = 1; j<=i; j++){

        // System.out.print("*");

        // }
        // System.out.println();

        // TRINGLE PATTERN

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of Rows = ");
        // int r = sc.nextInt();

        // for(int i = 1; i<=r ; i++){

        // for(int j = 1; j <= r - i; j++){
        // System.out.print(" ");

        // }
        // for(int k = 1; k <= 2*i-1;k++){
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // RECTANGLE PATTERN ==>>
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value = ");
        // int r = sc.nextInt();
        // for(int i = 1; i<=r; i++){
        // for(int j = i; j<=r; j++){
        // System.out.print(j);
        // }
        // for(int k = 1; k<=i-1; k++){
        // System.out.print(k);
        // }System.out.println();
        // }

        // RECANGULAR PATTERN BY USING NUMBERS
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the rows = ");
        // int r = sc.nextInt();
        // System.out.print("Enter the column = ");
        // int c = sc.nextInt();
        // for (int i = 1; i <= r; i++) {

        //     for (int j = 1; j <= c; j++) {
        //         // if (i == 1 || i == r || j == 1 || j == c) {
        //             System.out.print(j);
        //         // } else {
        //         //     System.out.print(" ");
        //         // }

        //     }
        //     System.out.println();
        // }


       // RECTANGULAR BOX 121212
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the rows = ");
        // int r = sc.nextInt();
        // System.out.print("Enter the column = ");
        // int c = sc.nextInt();
        // for (int i = 1; i <= r; i++) {

        //     for (int j = 1; j <= c; j++) {
                
                //    if(j % 2 != 0){
                //     System.out.print("1");
                //    }
                //    else{
                //     System.out.print(2);
                //    }
               
        //         if((i+j) % 2 == 0){
        //                 System.out.print("1");
        //                }
        //                else{
        //                 System.out.print(2);
        //                }

        //     }
        //     System.out.println();
        // }



        // TRIANGULAR PATTERN BY USING NUMBERS 123

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the vaule = ");
        // int r = sc.nextInt();
       

        // for(int i = 1; i<=r ; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }



        // TRINGLE PATTERN BY USING NUMB1ERS 123


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Rows = ");
        int r = sc.nextInt();
        sc.close(); // Close the Scanner to prevent resource leak

        for (int i = 1; i <= r; i++) {
            // Print leading spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // Print decreasing numbers
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            // Move to the next line
            System.out.println();
        }

    }
}
