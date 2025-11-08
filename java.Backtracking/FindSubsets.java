public class FindSubsets { // length of String = 2^n  TC=O(n*2^n) SC=O(2^n)
    public static void findSubsets(String str, String ans, int i){
        // Base Case
        if(i == str.length()){
           if (ans.length() == 0) {
            System.out.println("null");
           }
           else{
            System.out.println(ans);
           }
           return;
        }
        //recursion
        // Yes Choice
        findSubsets(str, ans+str.charAt(i), i+1);
        // NO choice
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
