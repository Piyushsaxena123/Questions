public class SumOfFirstNnaturalNumber {
    public static int SumOfFirstNNaturalNumber(int n){
        if(n == 1){
           return 1;
        }
       int s = SumOfFirstNNaturalNumber(n-1);
       int sum =  n + s;
       
       return sum;

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(SumOfFirstNNaturalNumber(n));
    }
}
