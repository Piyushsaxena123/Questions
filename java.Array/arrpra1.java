public class arrpra1 {
// public static void update(int marks[],int nonChangeable){
//     nonChangeable = 10;
//     for(int i = 0; i<marks.length; i++){
//         marks[i] = marks[i] + 1;
//         //  System.out.print(marks[i] + " ");
//     }
// }

    // public static void main(String[] args) {
    //     int marks[] = {97,98,99};
    //     int nonChangeable = 5;
    //     System.out.println("NonChangeable = " + nonChangeable);
    //     update(marks,nonChangeable);
    //     for(int i = 0; i<marks.length; i++){
    //         System.out.print(marks[i] + " ");
    //     }
    //     System.out.println();
    // }




    // Linear searh code ==>>
    // public static int linersearch(int a[],int key){
    //     for(int i = 0; i<a.length;i++){
    //         if(a[i] == key){
    //             return i;
    //         }
    //     }
    //     return-1;
    // }
    // public static void main(String[] args) {
    //     int a[] = {1,2,3,4,5};
    //     int key = 4;
        
    //     int index = linersearch(a, key);
    //     if(index == -1){
    //         System.out.println("Not found");
    //     }
    //     else{
    //         System.out.println("The Index of key = " + index);
    //     }
    // }

    // Reverse an array ==>>
    // public static void Reverseanarray(int number[]){
    //     int first = 0; int last = number.length - 1;
    //     while (first<last) {
    //         int temp = number[last] ;
    //         number[last] = number[first];
    //         number[first] = temp;
    //         first ++;
    //         last --;
    //     }
    // }
    // public static void main(String[] args) {
    //     int number[] = {2,4,6,8,10,12,14};
    //     Reverseanarray(number);
    //     for(int i = 0; i<number.length; i++){
    //         System.out.print(number[i] + " ");
    //     }
    // }

    // Pairs in array ==>>
//     public static void Pairsinarray(int number[]) {
//         for(int i = 0; i<number.length; i++){
//             int curr = number[i];
//             for(int j = i+1; j<number.length; j++){
//                 System.out.print("(" + curr + "," + number[j] + ")");
//             }
//         System.out.println();
//         }
//     }
    
//     public static void main(String[] args) {
//          int number[] = {2,4,6,8,10,12,14};
//         Pairsinarray(number);
// }

// public static void Subarray(int number[]){
//     int total = 0;
//     int sum = 0;
//     int maxcurr = Integer.MIN_VALUE;
//    for(int i = 0; i<number.length; i++){
         
//         for(int j = i ; j <number.length; j++){
//             sum = 0;
//             for(int k = i; k <= j; k++){
//             //   System.out.print(number[k] + " ");
//               sum = sum + number[k];
//             }System.out.println(sum);
//             total++;
          
//             if(maxcurr<sum){
//                 maxcurr = sum;
//             }

//         }System.out.println();
//    } System.out.println("Total no. of set or lines we get = " + total);
//    System.out.println("<Max Sum of an Sub array> = " + maxcurr);
// }
// public static void main(String[] args) {
//     int number[] = {2,4,6,8,10};
//     Subarray(number);
// }



// Prefix of Subarray ==>>
public static void Prefix(int number[]) {
    int c = 0;
    int max = Integer.MIN_VALUE;
    int prefix[] = new int[number.length];
    prefix[0] = number[0];
    for(int i = 1; i<number.length;i++){
        prefix[i] = prefix[i-1] + number[i]; 
    }
    for(int i = 0; i<number.length;i++){
        for(int j = i; j<number.length;j++){
            if(i==0){
                c = prefix[j];
            }
            else{
                c = prefix[j] - prefix[i-1];
            }
        }
        if(max<c){
            max = c;
        }
    }
    System.out.println("Maxsubarry = "+max);
    
}
public static void main(String[] args) {
    int number[] = {1,-2,6,-1,3};
    Prefix(number);
}
}
