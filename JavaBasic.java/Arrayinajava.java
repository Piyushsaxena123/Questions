class ArrayExample{
    void demoArray(){
    int[] ages = new int[3];
    float[] weight = new float[3];
    String[] names = new String[3];
    
    ages[0] = 34;
    ages[1] = 12;
    ages[2] = 45;
    // ages[5] = 50; // ArrayIndexOutOfBoundsException
    
    
    System.out.println(ages[0]);
    System.out.println(ages[1]);
    System.out.println(ages[2]);
    // System.out.println(ages[5]); // ArrayIndexOutOfBoundsException
  }
}


public class Arrayinajava {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArray(); 


    }
}
