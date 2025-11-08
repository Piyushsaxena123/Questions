import java.util.Scanner;

public class IndicesOfanTarget {
    public static void IndicesOfAnTarget(int arr[], int i, int target){
        if(i == arr.length){
           return;
        }
        if(arr[i] == target){
           System.out.print(i + " ");
        }
         IndicesOfAnTarget(arr, i+1, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,2,3,2,5};
        System.out.print("Enter the indeces of the target = ");
        int target = sc.nextInt();
        sc.close();
        System.out.print("The indeces of the target = ");
      IndicesOfAnTarget(arr, 0, target); // 2
    }
}
