public class MultiLevelInheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.Breath();
        // d.legs();
        System.out.print("Breed = ");
        d.breed();
        d.legs = 4;
        System.out.println("Haveing " + d.legs + " Legs");

    }
}
class Animal{
    String color;
    void eat(){
            System.out.println("Eating...");
    }
    void Breath(){
             System.out.println("Breathing...");
    }
}
class Mammals extends Animal{
    // void legs(){
    //     System.out.println("4 legs");
    // }
    int legs;

}
class dog extends Mammals{
    void breed(){
        System.out.println("Labra");
    }
}
