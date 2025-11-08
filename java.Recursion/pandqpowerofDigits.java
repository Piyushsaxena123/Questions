public class pandqpowerofDigits {
    // public static int power(int p, int q){
    //     if(q == 0){
    //         return 1;
    //     }
    //     int smallpower = power(p, q-1);
    //     return p*smallpower;
    // }
    // public static void main(String[] args) {
    //     System.out.println(power(2, 3));
    // }
    
    
    
    // Better version of power ==>>
    public static int power(int p , int q) {
        if(q == 0){
            return 1;
        }
        int smallpower = power(p, q/2);
        if(q % 2 == 0){ // Even
         return smallpower * smallpower;
        } // Odd
        return p*smallpower*smallpower;
    }
    public static void main(String[] args) {
        System.out.println(power(8, 2));
    }
}
