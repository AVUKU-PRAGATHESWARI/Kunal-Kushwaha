package Conditionals_loops;

import java.util.Scanner;

public class Volume_of_cone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and height of the triangle: ");
        int radius = input.nextInt();
        int height = input.nextInt();
        double volume = (3.14)*radius*radius*((double) height /3);
        System.out.println("The volume of cone is : "+volume);
    }

}
