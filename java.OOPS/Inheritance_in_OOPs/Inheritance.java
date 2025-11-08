class Inheritance{
public static void main(String[] args) {
Fish shark = new Fish();
shark.eat();
}

}
// Base Class
class Animal{
String color;
void eat(){
    System.out.println("Eat");
}
void breath(){
    System.out.println("Breath");
}
}
// Derived Class / SubClass
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swim in water");
    }
}
