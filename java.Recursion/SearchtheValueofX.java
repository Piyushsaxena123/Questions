public class SearchtheValueofX {
    public static boolean Search( int arr[], int x, int i){
        if(i == arr.length){
            return false;
        }
        if(arr[i] >= x){
            return true;
        }
        return Search(arr, x, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {4,12,54,14,3,8,6,1};
        
        System.out.println(Search(arr,14,0));
    }
}
