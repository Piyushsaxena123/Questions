import java.util.Scanner;
/*Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
 */
public class leetcode125ValidPalindrome {
    public static boolean isPalindrome(String s) {
        // Convert to lowercase and keep only letters/digits
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
        sc.close();
    }
}
