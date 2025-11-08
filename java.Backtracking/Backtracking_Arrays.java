class Backtracking_Arrays{
    // int arr[] = [1,2,3,4,5];
    // int arr[] = [-1,0,1,2,3]; // Decrease by -2 using Backtracking
    // TC = O(n) | SC = O(n)
    // Base Case
    public static void changeArr(int arr[] , int i , int val){
        if( i == arr.length){
            printArr(arr);
            return;
        }

        // Recursion 
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 2; // For Decrease by -2 using Backtracking
        }
        public static void printArr(int arr[]){
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            } System.out.println();
        }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);


    }
}