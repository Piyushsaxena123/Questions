public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println("BitwiseOperators");
        int p = 9 , q = 10 , r = 9 , k = 10;
        System.out.println(p|q); // 11  (10 = 1)
        System.out.println(p&q); // 8    (10 = 0)
        System.out.println(p^q); // 3 (same = 0 and different = 1)
        System.out.println(~p); //  -10  (0 = 1 and 1 = 0)
        System.out.println(p<<1); // 18 (1001 shift to left = 10010)
        System.out.println(r>>1); //  4 (1001 shift to right = 100)
        System.out.println(q<<1); //  20 (1010 shift to left = 10100)
        System.out.println(k>>1); //  5  (1010 shift to right = 101)
    }
}
