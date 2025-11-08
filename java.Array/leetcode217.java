import java.util.Arrays;
public class leetcode217 {
    // Time Complexity Exceeds
    //  public boolean containsDuplicate(int[] nums) {
    //     for(int i = 0; i<nums.length; i++){
    //      for(int j = i+1; j<nums.length; j++){
    //         if(nums[i] == nums[j]){
    //         return true;
    //      }
    //      }
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     int nums[] = {1,2,3,6};
        
    //     // Fix: Create an object of the class to call the non-static method
    //     leetcode217 obj = new leetcode217();
    //     System.out.println("Contains Duplicate? " + obj.containsDuplicate(nums));

    // }




    // 2nd approch by sorting ==>
     public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i<nums.length; i++){
          if(nums[i] == nums[i - 1]){
            return true;
          }
        }
        return false;
     }
     public static void main(String[] args) {
        int nums[] = {1,2,3,6};
       leetcode217 obj = new leetcode217();
        System.out.println(obj.containsDuplicate(nums));

     }
}
