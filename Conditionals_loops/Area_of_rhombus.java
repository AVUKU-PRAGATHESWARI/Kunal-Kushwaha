package Conditionals_loops;

import java.util.Scanner;

public class Area_of_rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two diagonals: ");
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        double area = (0.5 * d1 *d2);
        System.out.println("Area of rhombus is "+area);
        System.out.print("Enter the base and height: ");
        int base = input.nextInt();
        int height = input.nextInt();
        area=(base*height);
        System.out.println("Area of rhombus is "+area);
        System.out.print("Enter the angle: ");
        double angle=input.nextInt();
        double radians = Math.toRadians(angle);
        area=(base*base*(Math.sin(radians)));
        System.out.println("Area of rhombus is "+area);
    }
}
