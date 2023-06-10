package Conditionals_loops.Intermediate;

import java.util.Scanner;

public class Sum_of_a_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=input.nextInt() ,sum =0;
        while(number!=0){
            int digit = number % 10;
            number = number / 10;
            sum += digit;
        }
        System.out.println("Sum of digits of given numbers is : "+sum);
    }
}
