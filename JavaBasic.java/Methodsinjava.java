import java.util.Scanner;

class Algebra{
    int add(int a , int b){
        int ans = a + b;
        return ans;
    }
}


public class Methodsinjava {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of First number = ");
        int x = sc.nextInt();
        System.out.print("Enter the value of Second number = ");
        int y = sc.nextInt();
        int ans = obj.add(x, y);
        System.out.println( "Sum of input number = " + ans);
    }
}
