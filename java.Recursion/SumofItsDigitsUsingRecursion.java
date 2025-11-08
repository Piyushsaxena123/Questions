public class SumofItsDigitsUsingRecursion {
    public static int recursion(int n){
        // Mam's Base case ==>>
        if(n >= 0 && n <=9){
        return n;
       }
       // Another Base Case ==>>
        // if(n % 10 == 0){
        //     return n;
        // }

        // Recursive work + Self work
        return recursion(n/10) + n%10;
    }
    public static void main(String[] args) {
        // 1 2 3 4
        System.out.println(recursion(1234));
        
    }
}
