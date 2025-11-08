public class LinerSearch {
    public static int linersearch(int number[],int key){
      for(int i = 0; i < number.length;i++){
       if(number[i] == key){
         return i;
       }
       }
       return -1;
    }
    public static void main(String[] args) {
        int number[] = {10,20,30,40};
        int key = 30;
        int index = linersearch(number, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("key is at index : " + index);
        }
    }
}
