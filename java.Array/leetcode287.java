import java.util.Arrays;
public class leetcode287 {
    public static int s(int nums[]){
        Arrays.sort(nums);
    for(int i = 0 ; i < nums.length - 1; i++){
        if(nums[i] == nums[i+1]){
            return nums[i];
        }
    }
    return -1;
    
    }
    public static void main(String[] args) {
        int nums[] = {1,3,4,2,2};
        System.out.println("Duplicate number is : " + s(nums));

    }
}
