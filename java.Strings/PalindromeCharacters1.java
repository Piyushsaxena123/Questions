// 1st Method to find ==>>
public class PalindromeCharacters1 {
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i = 0; i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(n - i - 1)){
                return false;

            }
         }
        return true;
    }
    public static void main(String[] args) {
        String str = "noon"; // racecar , madam , malayalam
        System.out.println(isPalindrome(str));
    }
}

// 2nd Method to find ==>>
// public class PalindromeCharacters {
//     public static void main(String[] args) {
//         String str = "madam";
//         String rev = "";

//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev = rev + str.charAt(i);  // build reversed string
//         }

//         if (str.equals(rev)) {
//             System.out.println(str + " is a palindrome.");
//         } else {
//             System.out.println(str + " is not a palindrome.");
//         }
//     }
// }
