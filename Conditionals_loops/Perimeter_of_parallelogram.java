package Conditionals_loops;

import java.util.Scanner;

public class Perimeter_of_parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Base and Side of a parallelogram: ");
        int base = input.nextInt();
        int side = input.nextInt();
        int perimeter = 2*(base+side);
        System.out.println("The perimeter of PArallelogram is : "+perimeter);
    }
}
