import java.util.Scanner;

public class FirstOccarance {
    public static int FirstOccaranc(int arr[],int key,int i){
    if(i == arr.length){
        return -1;
    }
    if(arr[i] == key){
        return i;
    }
    return FirstOccaranc(arr,key,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of Key = ");
        int n = sc.nextInt();
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println("The index of key = "+FirstOccaranc(arr, n, 0));
        sc.close();
    }
}
