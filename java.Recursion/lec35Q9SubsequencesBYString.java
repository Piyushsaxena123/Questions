public class lec35Q9SubsequencesBYString {
    public static void printSSQ(String s, String currAns){
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }
        // s = "abc"
        char curr = s.charAt(0); // a
        String remString = s.substring(1); //bc
        printSSQ(remString, currAns + curr); // bc , " " + a ==> ["abc"]
        printSSQ(remString, currAns); // bc , " " ==> ["bc"]
    } 
    public static void main(String[] args) {
        printSSQ("abc", " ");
    }
}
