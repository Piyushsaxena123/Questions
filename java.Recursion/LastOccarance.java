public class LastOccarance {
    public static int Lastoccarance(int arr[] , int i, int target){
        if(i == arr.length){
            return -1;
        }
        int last = Lastoccarance(arr, i+1, target);
        if(last == -1 && arr[i] == target){
            return i;
        }
        // if(arr[i] == target){
        //     return i;
        // }
        // else{
        //     return last;
        // }
        return last;

    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(Lastoccarance(arr, 0, 2));
    }
}
