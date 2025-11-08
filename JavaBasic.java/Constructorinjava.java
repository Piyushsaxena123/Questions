class Algebra {
    int a;
    int b;

    // Constructor
    Algebra(int x, int y) {
        a = x;
        b = y;
        System.out.println("Constructor of Algebra class called");
    }

    // Methods
    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }
}

public class Constructorinjava {
    public static void main(String[] args) {
        // Creating object and passing values to the constructor
        Algebra obj = new Algebra(5, 7);
        
        // Calling methods and printing results
        System.out.println("Addition: " + obj.add());
        System.out.println("Subtraction: " + obj.sub());
        System.out.println("Multiplication: " + obj.mul());

        Algebra obj2 = new Algebra(10, 5);
        System.out.println("Addition: " + obj2.add());
        System.out.println("Subtraction: " + obj2.sub());
        System.out.println("Multiplication: " + obj2.mul());
    }
}
