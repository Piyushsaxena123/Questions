public class Logical {
    public static void main(String[] args) {
        System.out.println("LOGICAL OPERATORS");
        int p = 15, q = 10 , r = 5 , k = 15;

        // && operator
        System.out.println((p>q) && (q>r)); // Ture
        System.out.println((q>r) && (q>r)); // Flase

        // || operators
        System.out.println((p>q) || (q<r)); // True
        System.out.println((p>q) || (q>r)); // True
        System.out.println((p<q) && (q<r)); // False

        // ! operators
        System.out.println(!(p==q)); //True
        System.out.println(!(p>q)); // False
        System.out.println(!(p==k)); //False

    }
}
