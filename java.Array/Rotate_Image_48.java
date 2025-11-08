class Rotate_Image_48 {
    // Brute Force Approach
    public static void rotate(int[][] matrix) {
        // int n = matrix.length;
        // int ans[][] = new int[n][n];

        // // Step 1: Copy rotated values into ans
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         ans[j][n - 1 - i] = matrix[i][j];
        //     }
        // }

        // // Step 2: Copy ans back to matrix
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         matrix[i][j] = ans[i][j];
        //     }
        // }


        // Optimized ==>

                // Optimized ==>
        int n = matrix.length;
        int ans[][] = new int [n][n];
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
            }
        }

        // Reverse =>
        for(int i = 0; i<n ;i++){
            int left = 0, right = n - 1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    // Utility to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("\nRotated Matrix:");
        printMatrix(matrix);
    }
}
