package Conditionals_loops;

import java.util.Scanner;

public class Volume_of_cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and height : ");
        int radius = input.nextInt();
        int height = input.nextInt();
        double volume = (3.14)*radius*height;
        System.out.println("The volume of cylinder is: "+volume);
    }
}
