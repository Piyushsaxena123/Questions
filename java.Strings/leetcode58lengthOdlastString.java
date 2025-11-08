import java.util.Scanner;
class leetcode58lengthOdlastString {
public static int lengthOfLastWord(String s) {
       int length = 0;
       s = s.trim();
       for(int i = s.length() - 1; i>=0 ; i--){
        if(s.charAt(i) != ' '){
            length++;
        }
        else{
            break;
        }
       }
       return length;
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(lengthOfLastWord(s));
    }
}
