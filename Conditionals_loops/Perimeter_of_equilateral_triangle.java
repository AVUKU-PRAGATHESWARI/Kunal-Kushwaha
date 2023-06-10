package Conditionals_loops;

import java.util.Scanner;

public class Perimeter_of_equilateral_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of a triangle: ");
        int side = input.nextInt();
        int perimeter = 3*side;
        System.out.println("The perimeter of triangle is "+perimeter);
    }
}
