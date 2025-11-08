public class SelectionSort {
    public static void Selectionsort(int arr[]) {
        int n = arr.length;
        for(int i = 0; i<n-1;i++){
            int minpos = i;
            for(int j = i+1; j<n; j++){
                if(arr[minpos]>arr[j]){
                 minpos = j;
                }
            }
            // Swap ==>>
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void PrintSelection(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Selectionsort(arr);
        PrintSelection(arr);
    }
}
