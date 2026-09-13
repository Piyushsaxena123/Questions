class Solution {
    public void sortColors(int[] nums) {
        int f = 0, m = 0, l = nums.length - 1;
        while(m<=l){
            if(nums[m] == 0){
                int temp = nums[f];
                nums[f] = nums[m];
                nums[m] = temp;
                f++;
                m++;
            }else if(nums[m] == 1){
                m++;
            }else{
                int temp = nums[m];
                nums[m] = nums[l];
                nums[l] = temp;
               
                l--;
            }
        }
    }
}