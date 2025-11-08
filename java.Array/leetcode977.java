import java.util.Arrays;
public class leetcode977 {
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        square(nums);
        for(int i = 0; i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void square(int nums[]){
    for(int i = 0; i<nums.length; i++){
      nums[i] = nums[i] * nums[i];
    }
    Arrays.sort(nums);
    }
}
