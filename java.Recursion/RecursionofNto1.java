class RecursionofNto1{
    public static void decrementfromNto1(int n){
if(n == 1){
    System.out.print(n);
    return;
}
System.out.print(n + " ");
decrementfromNto1(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        decrementfromNto1(n);
        
    }
}