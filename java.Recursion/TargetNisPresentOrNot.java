public class TargetNisPresentOrNot {
    public static boolean TargetnisPresentOrNot(int arr[] , int target , int i){
        if(i == arr.length){
            return false;
        }
        if(arr[i] == target){
            return true;
        }
        return TargetnisPresentOrNot(arr, target, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {4,12,54,14,3,8,6,1};
        System.out.println(TargetnisPresentOrNot(arr, 1, 0) + " it is present in array.");
        System.out.println(TargetnisPresentOrNot(arr, 7, 0) +" it is not present in array." );
    }
}
