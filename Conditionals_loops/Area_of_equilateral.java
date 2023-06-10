package Conditionals_loops;

import java.util.Scanner;

public class Area_of_equilateral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of equilateral: ");
        int side = input.nextInt();
        double area = (Math.sqrt(3)*side*side)/4;
        System.out.println("Area of triangle can be : "+area);
    }
}
