class Solution {
    public int[] rearrangeArray(int[] nums) {
        // If the value are same in positive and negative then use this
    //    int n = nums.length;
    //   int ans[] = new int[n];
    //    int pos = 0 , neg = 1;
    //    for(int i = 0; i< n; i++){
    //     if(nums[i] < 0){
    //         ans[neg] = nums[i];
    //         neg += 2;
    //     }
    //     else{
    //         ans[pos] = nums[i];
    //         pos += 2;
    //     }
    //    }
    //    return ans; 


    // If the value are not same in positive and negative then use this

         ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        int n = nums.length;

        // Store positive and negative numbers separately
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }

        // If positive numbers are more
        if (pos.size() > neg.size()) {

            for (int i = 0; i < neg.size(); i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }

            int index = neg.size() * 2;

            for (int i = neg.size(); i < pos.size(); i++) {
                nums[index] = pos.get(i);
                index++;
            }

        } 
        
        // If negative numbers are more or equal
        else {

            for (int i = 0; i < pos.size(); i++) {
                nums[2 * i] = pos.get(i);
                nums[2 * i + 1] = neg.get(i);
            }

            int index = pos.size() * 2;

            for (int i = pos.size(); i < neg.size(); i++) {
                nums[index] = neg.get(i);
                index++;
            }
        }

        return nums;
    }
}