public class HybridInheritance {
    public static void main(String[] args) {
        
        Fish f = new Fish();
        System.out.println("Fish are doing => ");
        f.Smell();
        f.Swim();
        Bird b = new Bird();
        System.out.println("Birds are doing => ");
        b.eat();
        b.Fly();
        System.out.println("(Peacock)");
        Peacock p = new Peacock();
        p.notfly();
        Dog d = new Dog();
        System.out.println("Dog are doing => ");
        d.eat();
        d.walk();
        d.breed();
        Cat c = new Cat();
        System.out.println("cat are doing => ");
        c.eat();
        c.color();

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
class Peacock extends Bird{
    void notfly(){
        System.out.println("Not Flying..");
    }
}
class Mammals extends Animal{
    void walk(){
        System.out.println("Walking...");
    }
}
class Dog extends Mammals{
    void breed(){
        System.out.println("Labrea...");
    }
}
class Cat extends Mammals{
    void color(){
        System.out.println("White");
    }
}
