package Conditionals_loops;

import java.util.Scanner;

public class Curved_surface_area_of_cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and height: ");
        int radius = input.nextInt();
        int height = input.nextInt();
        double curved_surface_area = 2*(3.14)*radius*height;
        System.out.println("Curved Surface Area is: "+curved_surface_area);
    }
}
