public class StringFunctionCompair {
    public static void main(String[] args) {
        String S1 = "Tony";
        String S2 = "Tony";
        String S3 = new String("Tony");
        if(S1 == S2){ // In stack it can both s1 and s2 point the same tony
            System.out.println("Equal"); 
        }
        else{
            System.out.println("Not Equal");
        }
        if(S1 == S3){
            System.out.println("Equal"); // In stack it cannot both s1 and s3 point the same tony because the s3 make the new position
       // int the stack , that can make another position to store the value
        }
        else{
            System.out.println("Not Equal");
        }
        if(S1.equals(S3)){ // .equal() check the value of S1 = 4 , S3 = 4 , so these are equal
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
