public class leetcode27 {
    public static int removeElements(int nums[] , int val) {
        int k = 1;
        for(int i = 1; i<nums.length; i++){
          if(nums[i] != val){
            nums[k] = nums[i];
            k++;
          }
        }
        return k;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;
        System.out.println(removeElements(nums, val));
    }
}
