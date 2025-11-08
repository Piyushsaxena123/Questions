public class MaxValueInArray {
    public static int printMaxArray(int arr[],int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallAns = printMaxArray(arr,idx+1);
        return Math.max(arr[idx], smallAns);
       
    }
    public static void main(String[] args) {
        int arr[] = {5,6,8,3,7};
       System.out.println( printMaxArray(arr, 0));;
    }
}
