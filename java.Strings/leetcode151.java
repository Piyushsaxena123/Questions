public class leetcode151 {
    /* Example 1:
       Input: s = "the sky is blue"
       Output: "blue is sky the"

       Example 2:
       Input: s = "  hello world  "
       Output: "world hello"
       Explanation: Your reversed string should not contain leading or trailing spaces.
    */
    public static String reverseWords(String s) {
        // Trim leading/trailing spaces and split by one or more spaces
        String[] word = s.trim().split("\\s+");
        int left = 0, right = word.length - 1;

        // Reverse the array in-place
        while (left < right) {
            String temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            left++;
            right--;
        }

        // Join words back with a single space
        return String.join(" ", word);
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s)); // Output: "blue is sky the"
    }
}
