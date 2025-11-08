public class CheckSortedArray {
    public static boolean SortedOrNot(int arr[], int i){
        if(i == arr.length - 1){ // 1 2 3 4 5
            return true;
        }
        // 1 > 2 because if this condition is false then why should we check whole array
        if(arr[i] > arr[i+1]){
            return false;
        }
        return SortedOrNot(arr, i+1);
    }
    public static void main(String[] args) {
        System.out.println("Check the array is Sorted == true or not true(false)");
        int arr[] = {1,2,3,4,5}; 
        System.out.println(SortedOrNot(arr, 0));
       
    }
}
