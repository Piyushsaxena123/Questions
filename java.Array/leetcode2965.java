public class leetcode2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeating = -1, missing = -1;
        int n = grid.length;

       
        for (int i = 0 ; i < n; i++) {
            for (int j = 0 ; j < n; j++) {
                int curr = Math.abs(grid[i][j]); 
                int row = (curr - 1) / n;
                int column = (curr - 1) % n;

                if (grid[row][column] < 0) {
                    repeating = curr;
                } else {
                    grid[row][column] *= -1;
                }
            }
        }

        // Find the missing number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    missing = (i * n) + (j + 1);
                    break;
                }
            }
        }

        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3}, {2, 2}};
        leetcode2965 obj = new leetcode2965();
        int[] result = obj.findMissingAndRepeatedValues(grid);

        System.out.println("Repeated and Missing : " + "[" + result[0] + "," + result[1] + "]");
       
    }
}
