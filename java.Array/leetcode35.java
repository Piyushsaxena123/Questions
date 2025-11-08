public class leetcode35 {
    public static int searchInsert(int[] nums, int target) {
        // Time Compextity == 0[n] Worst TC
        // for(int i = 0 ; i < nums.length; i++){
        //     if(nums[i] >= target){
        //         return i;
        //     }
            
        // }
        // return nums.length;

        // Time Compextity == 0[log(n)] Optimized TC
        int left = 0; int right = nums.length;
        while (left<right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;

    } 
    public static void main(String[] args) {
        int nums[] = {1,3,3,3,3,5,6};
        int target = 3;
        System.out.println(searchInsert(nums,target));
    }
}
