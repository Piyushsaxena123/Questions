import java.util.Arrays;
public class leetcode238 {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int p[] = new int[n];
        p[0] = 1;
       
           for(int i = 1; i<n ; i++){
            p[i] = p[i-1] * nums[i-1]; 
        }
        int s = 1;
        for(int i = n - 1; i>=0; i--){
            p[i] *= s; // multiply prefix with suffix
            s *= nums[i];  // update suffix
           //  result[i] = product of all elements before i × product of all elements after i
        }
      
        return p;
    
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}