public class multipleofNum {
    public static void multiple(int n,int k){
        if(k==0){
            return;
        }
        multiple(n, k-1);
        System.out.println(n*k + " ");
    }
    public static void main(String[] args) {
        multiple(3, 8);
    }
}
