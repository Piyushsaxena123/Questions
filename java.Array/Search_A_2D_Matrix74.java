public class Search_A_2D_Matrix74 {
     public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0, high = n * m - 1;
        while(low <= high){
          int mid = (low+high)/2;
          int row = mid / m;
          int column = mid % m;
          if(matrix[row][column] == target){
            return true;
          }
          else if(matrix[row][column] < target){
            low = mid + 1;
          }else{
            high = mid - 1;
          }
         
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 6;
      System.out.println(searchMatrix(matrix, target));

    }
}
