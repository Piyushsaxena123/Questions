public class Recursionof1toN {
    public static void Incrementfrom1toN(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
       
        Incrementfrom1toN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        Incrementfrom1toN(n);
    }
}
