public class leetcode53Subarray {
    public static int MaxSubarray(int [] nums){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length;i++){
            cs = Math.max(nums[i], cs + nums[i]);
            ms = Math.max(ms,cs);
        }
        return ms;
    }
    public static void main(String[] args) {
        int nums[] = {5,4,-1,7,8};
        System.out.println(MaxSubarray(nums));
    }
}
