public class TrappingRain42 {
    public static int TrappingRain(int height[]){
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int j = n - 2; j>=0; j--){
            rightMax[j] = Math.max(height[j],rightMax[j+1]);
        }
        int TrappingRain = 0;
        for(int i = 0; i<n ; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            TrappingRain += waterlevel - height[i];
        }

        return TrappingRain;
    }


    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(TrappingRain(height));
    }
}
