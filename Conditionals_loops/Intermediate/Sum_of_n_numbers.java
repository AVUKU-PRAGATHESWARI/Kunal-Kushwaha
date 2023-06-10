package Conditionals_loops.Intermediate;

import java.util.Scanner;

public class Sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter zero to stop entering a number ");
        System.out.print("Start entering your numbers in line: ");
        int sum = 0;
        int number= input.nextInt();
        while(number!=0){
            sum += number;
            number = input.nextInt();
        }
        System.out.println("The sum of given numbers is: "+sum);
    }
}
