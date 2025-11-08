import java.util.ArrayList;
import java.util.Collections;

public class ReverseAnArrayByArrayList {
    public static void ReverseAnList(ArrayList<Integer> list){
        int i = 0; int j = list.size() - 1;
        
        while (i < j) {
            /*
             * 
             int temp = a;
             a = b;
             b = temp;
             */

             Integer temp = Integer.valueOf(list.get(i));
             list.set(i, list.get(j));
             list.set(j,temp);

             i++;
             j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List " + list);
        Collections.reverse(list);
        // ReverseAnList(list);
        System.out.println("Reversed List " + list);



    }
}
