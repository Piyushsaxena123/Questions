public class numAndKPrint_k_MultipleOfNum {
   public static void Print_Multiples(int n,int k){
     if(k == 0){
        return;
    }
    Print_Multiples(n, k-1);
    System.out.println(n*k);
   }
    public static void main(String[] args) {
       Print_Multiples(12,5);
    }
}
