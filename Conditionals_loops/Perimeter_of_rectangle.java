package Conditionals_loops;

import java.util.Scanner;

public class Perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length and breadth of rectangle: ");
        int length = input.nextInt();
        int breadth = input.nextInt();
        int perimeter = 2*(length+breadth);
        System.out.println("The perimeter of rectangle is: "+perimeter);
    }
}
