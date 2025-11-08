import java.util.Scanner;
public class IfelseIf {
    public static void main(String[] args) {
        System.out.println("IF-ELSE-IF & NESTED IF - ELSE IN JAVA");
        System.out.print("ENTER THE AGE = ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        //IF-ELSE-IF

        // if(age<12){
        //     System.out.println("CHILD");
            
        // }
        // else if(12<=age && age<=18){
        //     System.out.println("TEENAGER");
        // }
        // else{
        //     System.out.println("ADULT");
        // }
        // sc.close();


        //NESTED IF - ELSE
        if(age<12){
           if(age<=5){
                System.out.println("TODDLER");
            }
            else{
                System.out.println("CHILD");
            }
            
        }
        else if(12<=age && age<=18){
            System.out.println("TEENAGER");
        }
        else{
            System.out.println("ADULT");
        }
        sc.close();

    }
}
