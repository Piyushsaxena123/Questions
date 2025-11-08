import java.util.Arrays;

public class leetcode344 {
/*
 * Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
     */

     public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left<right) {
            char temp = s[left]; // temp = h,  o = e , l = l
            s[left] = s[right]; // h = o,   e = l , l =  l
            s[right] = temp;  // o = temp ,  l = temp , 
            // o, l, l, e, h
            left++;
            right--;
        }
     }
     public static void main(String[] args) {
      
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
        System.out.println(Arrays.toString(s1));


     }
}
