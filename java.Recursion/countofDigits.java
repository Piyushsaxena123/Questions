public class countofDigits {
    public static int count(int n){
       
        if(n>=0 && n<=9){
            return 1;
        }
        int f = count(n/10);
        int c = f + 1;
        return c;
    }
    public static void main(String[] args) {
       
        System.out.println(count(2678));
        System.out.println(count(5683));
        System.out.println(count(539));
    }
}
