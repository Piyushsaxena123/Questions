public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int rev = 0;
        int or = num;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;

        }
        if (or == rev) {
            System.out.println(or + " is a palindrome.");
        } else {
            System.out.println(or + " is not a palindrome.");
        }

    }
}
