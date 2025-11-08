public class MaxSubarrayBrutForce {
    public static void MaxSubarray(int number[]){
        int crr = 0;
        int maxcurr = Integer.MIN_VALUE;
        for(int i = 0; i<number.length; i++){
            for(int j = i; j<number.length; j++){
                crr = 0;
                for(int k = i ; k <=j ; k++){
                  crr = crr + number[k];
                }
                System.out.println(crr);
                if(maxcurr <  crr){
                    maxcurr = crr;
                }
            }
        }
        System.out.println("Max Sub array = " + maxcurr);
    }


    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        MaxSubarray(number);
    }
}
