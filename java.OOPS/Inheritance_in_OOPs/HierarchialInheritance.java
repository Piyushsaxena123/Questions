public class HierarchialInheritance {
    public static void main(String[] args) {
        Fish f = new Fish();
        System.out.println("Fish are doing => ");
        f.Smell();
        f.Swim();
        Bird b = new Bird();
        System.out.println("Birds are doing => ");
        b.eat();
        b.Fly();
        Mammals m = new Mammals();
        System.out.println("Mammals are doing => ");
        m.eat();
        m.walk();
    }
}
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
    void Smell(){
        System.out.println("Smelles...");
    }
}
class Fish extends Animal{
    void Swim(){
        System.out.println("Swimming...");
    }
}
class Bird extends Animal{
    void Fly(){
        System.out.println("Flying...");
    }
}
class Mammals extends Animal{
    void walk(){
        System.out.println("Walking...");
    }
}
