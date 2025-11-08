 import java.util.ArrayList;
import java.util.Collections;
public class SortingByArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List = " + list);
        Collections.sort(list);
        System.out.println("Sorted List(Ascending) = " + list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Reversed Sorted List(Descending) = " + list);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");

        System.out.println(l1);
         Collections.sort(l1);
        System.out.println("Sorted List(Ascending) = " + l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Reversed Sorted List(Descending) = " + l1);

        System.out.println(l1.size());



    }
}


