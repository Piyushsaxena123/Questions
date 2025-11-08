public class SumOfElementinArray {
    public static int SumOfElementInArray(int arr[], int i){
        if(i == arr.length){
            return 0;
        }
        return arr[i] + SumOfElementInArray(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,2,0,1};
        System.out.println(SumOfElementInArray(arr, 0));
    }
}
