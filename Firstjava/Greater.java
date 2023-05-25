package Firstjava;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int first_number=input.nextInt();
        System.out.print("Enter your second number: ");
        int second_number=input.nextInt();
        if (first_number>second_number){
            System.out.println("The largest number is : "+first_number);
        }
        else{
            System.out.println("The largest number is : "+second_number);
        }
    }
}
