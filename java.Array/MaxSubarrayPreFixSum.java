public class MaxSubarrayPreFixSum {
    public static void MaxSubarrayPrefixSum(int number[]){
        int curr = 0;
        int maxcurr = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        for(int i = 1; i < number.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }

        for(int i = 0; i < number.length; i++){
            for(int j = i; j < number.length; j++){
                // curr = number[i] == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if(i == 0){
                    curr = prefix[j];
                }
                else{
                   curr =  prefix[j] - prefix[i - 1];
                }
            }       
            if(maxcurr < curr){
                maxcurr = curr;
            }
        }
        System.out.println("Max Subarray = " + maxcurr);
    }

    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        MaxSubarrayPrefixSum(number);
    }
    
}
