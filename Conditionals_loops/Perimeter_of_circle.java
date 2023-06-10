package Conditionals_loops;

import java.util.Scanner;

public class Perimeter_of_circle  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of circle: ");
        int radius = input.nextInt();
        double perimeter = 2*(3.14)*radius;
        System.out.println("The perimeter of the circle is : "+perimeter);
    }
}
