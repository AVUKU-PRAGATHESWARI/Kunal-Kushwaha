package Conditionals_loops;

import java.util.Scanner;

public class Perimeter_of_square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of a square ");
        int side = input.nextInt();
        int perimeter = 4*side;
        System.out.println("The perimeter of the square is : "+perimeter);
    }
}
