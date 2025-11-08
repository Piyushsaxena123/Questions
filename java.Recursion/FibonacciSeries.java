public class FibonacciSeries {
    public static int Fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Fibonacci(5)); // 0 1 1 2 3
        // Explanation of output ==>>
        // 0 => 0
        // 0 + 1 => 1
        // 1 + 1 => 2
        // 1 + 2 => 3
        // 2 + 3 => 5
    }
}
