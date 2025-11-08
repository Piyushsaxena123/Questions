import java.util.ArrayList;
class lec35Q8Find_Subsequences{
    public static ArrayList<String> getSSQ(String s){
    // s = "abc"
    ArrayList<String> ans = new ArrayList<>();
    // base case ==>
    if(s.length() == 0){
        ans.add(" ");
        return ans;
    }
    char curr = s.charAt(0); // a
    ArrayList<String> SmallAns = getSSQ(s.substring(1)); // bc
    for(String ss : SmallAns){
        ans.add(ss); // bc b c " " // Self Work
        ans.add(curr + ss); // abc  ab ac "a" // Recurrence relation

    }
    return ans;
    }
    public static void main(String[] args) {
        ArrayList <String> ans = getSSQ("abc");
        System.out.println(ans);
        for(String ss : ans){
            System.out.println(ss);
        }
        System.out.println("Number of subsequences are present ==> " + ans.size());
    }
}