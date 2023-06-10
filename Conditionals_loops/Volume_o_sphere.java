package Conditionals_loops;

import java.util.Scanner;

public class Volume_o_sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int radius = input.nextInt();
        double volume = (4/3.0)*(3.14)*(radius*radius*radius);
        System.out.println("The Volume of square is : "+volume);
    }
}
