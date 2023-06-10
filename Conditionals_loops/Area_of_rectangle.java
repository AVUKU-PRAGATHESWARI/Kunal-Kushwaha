package Conditionals_loops;

import java.util.Scanner;

public class Area_of_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length and breadth of rectangle:");
        int length = input.nextInt();
        int breadth = input.nextInt();
        int area = length*breadth;
        System.out.println("Area of rectangle is: "+area);



    }
}
