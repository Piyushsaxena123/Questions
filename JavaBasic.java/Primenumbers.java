import java.util.Scanner;
public class Primenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number pls = ");
        int n = sc.nextInt();
        int div = 2;
        while(div<n){
            if(n % div == 0){
                System.out.println("Not Prime");
                break;
            }
            else{
                System.out.println("Prime Number");
                break;
            }
        }
    }
}
