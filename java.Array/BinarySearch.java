public class BinarySearch {
    public static int Binarysearch(int number[],int key){
        int start = 0;
        int end = number.length - 1;
        
        while (start<=end) {
            int mid = (start+end)/2;
            //comparisions ==>>
            if(number[mid] == key){
                return mid;
            }
            else if(number[mid]<key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7};
        int key = 6;
        int index = Binarysearch(number, key);
        System.out.println("The index = " + index);
    }
}
