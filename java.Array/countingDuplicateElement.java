import java.util.Arrays;
public class countingDuplicateElement {
   public static int findDuplicates(int[] nums){
        Arrays.sort(nums); // Fix: Use Arrays.sort
        int c = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                c++;
                // Skip the next duplicates of the same number
                while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int nums[] = {4, 3, 2, 7, 8, 2, 3, 1}; // Sorted: {1,2,2,3,3,4,7,8}
        System.out.println(findDuplicates(nums)); // Output: 2 (2 and 3 are duplicates)
    }

}