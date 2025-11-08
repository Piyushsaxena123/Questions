import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode56 {
    //   public static List<int[]> mergeOverlappingIntervals(int[][] arr){
    //     int n = arr.length;
    //     Arrays.sort(arr,(a,b) -> Integer.compare(a[0], b[0]));
    //     List<int[]> ans = new ArrayList<>();
    //     for(int i = 0; i<n; i++){
    //         int start = arr[i][0];
    //         int end = arr[i][1];
    //         if (!ans.isEmpty() && end<=ans.get(ans.size() - 1)[1]) {
    //             continue;
    //         }

    //         for(int j = i+1; j<n; j++){
    //             if(arr[j][0] <= end){
    //                 end = Math.max(end, arr[j][1]);
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //         ans.add(new int[]{start,end});
    //     }
    //     return ans;
    //   }


    // Optimized Code
     public static int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
         List<int[]> ans = new ArrayList<>();
        for(int[]interval:intervals){
           if(ans.isEmpty()||interval[0]>ans.get(ans.size()-1)[1]){
            ans.add(interval);
           }else{
            ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
           }
        }
            return ans.toArray(new int[ans.size()][]);
     }
      public static void main(String[] args) {
                int[][] arr = {{1, 3}, {2, 6}, {8, 9}, {9, 11},{8, 10},{2, 4},{15, 18},{16, 17}};

        int [][]result = merge(arr);
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
     
      }
}
