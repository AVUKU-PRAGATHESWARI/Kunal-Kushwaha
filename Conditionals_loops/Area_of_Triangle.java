package Conditionals_loops;

import java.util.Scanner;

public class Area_of_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and height of your triangle: ");
        int base = input.nextInt();
        int height = input.nextInt();
        double area =(0.5*base*height);
        System.out.println("The area of triangle can be: "+area);
    }
}
