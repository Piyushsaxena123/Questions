import java.util.HashMap;
public class HashMapOperations {
    public static void main(String[] args){
        // Create a HashMap
        HashMap<String,Integer> hm = new HashMap<>();

        // Input 
        hm.put("India", 100);
        hm.put("china",150);
        hm.put("US",50);
        System.out.println(hm);

        // Get 
        int population = hm.get("India");
        System.out.println("Population of India: " + population);
        System.out.println(hm.get("Indonasia")); // null

        // Contains Key
        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("Indonasia")); // false

        // Remove Key
        hm.remove("china");
        System.out.println(hm);
        hm.remove("Indonasia"); // null
        System.out.println(hm);

        // Size key
        System.out.println(hm.size()); // 2

        // IsEmpty key
        System.out.println(hm.isEmpty()); // false

        // Clear key
        hm.clear(); // null
        System.out.println(hm);
    }
}