package Conditionals_loops;

import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius:");
        int radius=input.nextInt();
        double area=(3.14*radius*radius);
        System.out.println("Area of Circle is : "+area);
    }
}
