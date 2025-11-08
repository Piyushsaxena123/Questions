public class UranaryOperators {
    public static void main(String[] args) {
        System.out.println("URANARY OPERATORS");
        int p = 5 ; 
        int q = 5;

        System.out.println(p++); // 5
        System.out.println(p);  // 6


        System.out.println(++q); // 6
        System.out.println(q); // 6

        // p = 6 and q = 6

        int x = p++;
        int y = ++q;

        System.out.println(x++); // 6
        System.out.println(++y); // 8

        System.out.println(x); // 7
        System.out.println(y); // 8
    }
}
