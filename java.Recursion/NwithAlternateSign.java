// 1 - 2 + 3 - 4 + 5
import java.util.Scanner;
public class NwithAlternateSign {
    public static int AlternateSign(int n){
        if(n == 1){ 
            return 1;
        }
        if(n % 2 == 0){
            return AlternateSign(n - 1) - n;
        }
        else{
            return AlternateSign(n - 1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(AlternateSign(n));
        sc.close();
    }
}
