public class TypesOfInheritance {
    public static void main(String[] args) {
// In Java, **inheritance** is a mechanism 
// where one class (called the *derived class* or *child class*) inherits properties 
// and behaviors (fields and methods) from another class (called the *base class* or *parent class*). 
// It promotes **code reuse** and establishes a natural hierarchy between classes.


// ### 🔷 Types of Inheritance in Java

// 1. **Single Inheritance**

//    * One class inherits from another class.
//    * Example: `class B extends A {}`

// 2. **Multilevel Inheritance**

//    * A class inherits from a class, which in turn inherits from another class.
//    * Example: `class C extends B`, `class B extends A`

// 3. **Hierarchical Inheritance**

//    * Multiple classes inherit from a single class.
//    * Example: `class B extends A`, `class C extends A`

// 4. **Hybrid Inheritance** *(Not supported directly in Java due to ambiguity)*

//    * A combination of two or more types of inheritance. Achieved through **interfaces** in Java.

// > ❌ **Multiple Inheritance (by classes)** is not supported in Java to avoid ambiguity (Diamond Problem).
// > ✅ Java supports **multiple inheritance using interfaces**.

// ---

// ### 📊 Flowchart of Base and Derived Classes (Example)

// Let’s visualize the **Single**, **Multilevel**, and **Hierarchical** inheritance structures:

// ---

// #### ✅ 1. **Single Inheritance**

// ```
//      [Base Class A]
//            ↓
//      [Derived Class B]
// ```

// ---

// #### ✅ 2. **Multilevel Inheritance**

// ```
//      [Base Class A]
//            ↓
//      [Derived Class B]
//            ↓
//      [Derived Class C]
// ```

// ---

// #### ✅ 3. **Hierarchical Inheritance**

// ```
//          [Base Class A]
//           /         \
//          ↓           ↓
//  [Derived Class B]  [Derived Class C]
// ```

// ---

// ### 🧠 Example Code: Single Inheritance

// ```java
// class Animal {
//     void eat() {
//         System.out.println("This animal eats food.");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("The dog barks.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();  // inherited from Animal
//         d.bark();
//     }
// }
// ```
 }
}
