import java.util.Scanner;
import java.util.Arrays; // Import Arrays class for proper array printing

public class arrpr {
    public static void main(String[] args) {
        int marks[] = new int[50];
        int number[] = {1, 2, 3};
        String moreNumber[] = {"apple", "mango", "banana"};

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Marks: " + Arrays.toString(Arrays.copyOf(marks, 3))); // Print only the first 3 elements
        System.out.println("Number: " + Arrays.toString(number));
        System.out.println("More Number: " + Arrays.toString(moreNumber));

        sc.close();
    }
}
