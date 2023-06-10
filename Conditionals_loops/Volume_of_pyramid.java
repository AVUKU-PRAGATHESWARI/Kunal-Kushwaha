package Conditionals_loops;

import java.util.Scanner;

public class Volume_of_pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Base length: ");
        int base_length = input.nextInt();
        System.out.print("Enter the Base width: ");
        int base_width = input.nextInt();
        System.out.print("Enter the Pyramid height: ");
        int pyramid_height = input.nextInt();
        double volume = (base_length*base_width*pyramid_height)/3.0;
        System.out.println("The volume of pyramid : "+volume);
    }
}
