import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Calculate the Simple Intrest");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principle value = ");
        float p = sc.nextFloat();

        System.out.print("Enter the Rate value = ");
        float r = sc.nextFloat();

        System.out.print("Enter the Time = ");
        float t = sc.nextFloat();

        float si = (p*r*t)/100;

        System.out.println("The Principle = " + p);
        System.out.println("The Rate  = " + r);
        System.out.println("The Time = " + t);
        
        System.out.println("The Simple Intrest = "+ si);
        sc.close();
    }
}
