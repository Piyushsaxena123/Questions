import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        System.out.println("Definition of Array ==>>");
        System.out.println("List of element of (same) type placed in a (contiguous) memory location.");
        // Creating an array ==>>
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // math
        sc.close();

        System.out.println("Physics = " + marks[0]);
        System.out.println("Chemistry = " + marks[1]);
        System.out.println("Math = " + marks[2]);

        marks[2] = 100;
        System.out.println("New marks of math = " + marks[2]);
        marks[2] = marks[2] + 1;
        System.out.println("Add one number in original marks = " + marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage = " + percentage);


        // Length of Array = >>
        int mar[] = new int[8];
        System.out.println("Length = " + mar.length);
        System.out.println("Original length of marks = " + marks.length);


    }

}