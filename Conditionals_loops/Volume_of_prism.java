package Conditionals_loops;

import java.util.Scanner;

public class Volume_of_prism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the area of base and height of prism: ");
        int area_of_base = input.nextInt();
        int height = input.nextInt();
        int volume = area_of_base*height;
        System.out.println("The Volume of prism is: "+volume);
    }
}
