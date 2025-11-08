public class AssignmentOperators {
   public static void main(String[] args) {
    System.out.println("Assignment Operators");
    int p = 10;
    int q ;

    // = 
    q = p;
    // ans = 10
    System.out.println(q);

    // +=   p+=q ==>  p = 10 + 10  where p = 10 and q = 10 ans = 20
    p+=q;
    System.out.println(p);

    // -=   p-=q  ==> p = 20 - 10 where p =20 and q =10  ans = 10
    p-=q;
    System.out.println(p);

    // *= p*=q ==> p = 10 * 10 where p = 100
    System.out.println(p*=q);

    // /=  p/=q ==> p = 1000 / 10 where p = 1000 and q = 10 ans = 10
    p/=q;
    System.out.println(p);

    // %=  p%=q ==>  p = 10 % 10 where p =10 and q = 10  remainder = 0
    System.out.println(p%=q);

   } 
}
