public class SmallestNumber {
    public static int smallestNumber(int number[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<number.length;i++){
            if(smallest>number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int number[] = {1,2,6,3,5};
        System.out.println("The Smallest number in Array = " + smallestNumber(number));
    }
}
