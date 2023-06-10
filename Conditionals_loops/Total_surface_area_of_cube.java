package Conditionals_loops;

import java.util.Scanner;

public class Total_surface_area_of_cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of a cube: ");
        int side = input.nextInt();
        int total_surface_area = 6*side*side;
        System.out.println("The Total surface area of a cube is "+total_surface_area);
    }
}
