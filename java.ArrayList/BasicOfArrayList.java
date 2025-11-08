import java.util.ArrayList;

class BasicOfArrayList{
    public static void main(String[] args) {
      // Wrapper Class ==>>
      ArrayList<Integer> l1 = new ArrayList<>();
      l1.add(5);
      l1.add(6);
      l1.add(7);
      l1.add(8);

      // Get an element an index i
      System.out.println(l1.get(1));

      // Print with for loop ==>>
      for(int i = 0; i<l1.size();i++){
        System.out.println(l1.get(i)); // 5,6,7,8
      }

      // printing the array list directly ==>>
      System.out.println(l1); // [5,6,7,8]

      // adding element at some index i ==>>
      l1.add(1,100);
      System.out.println(l1);

      // modifying element at index i ==>>
      l1.set(1,10);
      System.out.println(l1);

      // removing an element at index i ==>>
      l1.remove(1);
      System.out.println(l1);

      // removing an element e ==>>
      l1.remove(Integer.valueOf(7));
      System.out.println(l1);

      // checking if an element exists ==>>
      boolean ans = l1.contains(Integer.valueOf(6));
      System.out.println(ans);

      // if you don't specify class , you can put anything inside l ==>>
      ArrayList l = new ArrayList<>();
      l.add("pqrs");
      l.add(1);
      l.add(true);
      System.out.println(l);

   
    }
}