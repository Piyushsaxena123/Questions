public class sample {
    // public static void sample(int n){
    //     if(n==1){
    //          System.out.print(n +" ");
    //         return;
    //     }
    //     sample(n-1);
    //     System.out.print(n + " ");
       
    // }

    // public static int factorial(int n){
    //     if(n==1||n==0){
    //         return 1;
    //     }
    //     return factorial(n-1)+factorial(n-2);
    // }

    // public static boolean sorted(int arr[],int n){
    //     if(n == arr.length-1){
    //         return true;
    //     }
    //     if(arr[n]>arr[n+1]){
    //        return false;
    //     }
    //     return sorted(arr, n+1);

    // }

    // public static int FirstOccurence(int arr[],int n,int key){
    //     if(n == arr.length){
    //         return -1;
    //     }
    //     if(arr[n] == key){
    //         return n;
    //     }
    //     else{
    //         return FirstOccurence(arr, n+1, key);
    //     }
    // }

    public static int LastOccurence(int arr[],int n,int key){
        if(n == arr.length){
            return -1;
        }
        int isFound = LastOccurence(arr, n+1, key);
        if(isFound == -1 && arr[n] == key){
            return n;
        }
      return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(LastOccurence(arr, 0, 5));
    }

}
