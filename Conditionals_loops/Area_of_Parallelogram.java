package Conditionals_loops;

import java.util.Scanner;

public class Area_of_Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and height of Parallelogram");
        int base = input.nextInt();
        int height = input.nextInt();
        double area=base*height;
        System.out.println("Area of Parallelogram is: "+area);
    }
}
