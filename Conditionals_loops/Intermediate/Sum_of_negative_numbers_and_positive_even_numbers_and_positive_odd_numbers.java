package Conditionals_loops.Intermediate;

import java.util.Scanner;

public class Sum_of_negative_numbers_and_positive_even_numbers_and_positive_odd_numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter zero to stop entering a number: ");
        int sum_of_negative_numbers = 0 , sum_of_positive_even_numbers = 0 , sum_of_positive_odd_numbers = 0;
        int number;
        do {
            number = input.nextInt();
            if(number < 0){
                sum_of_negative_numbers += number;
            }
            else if(number%2==1){
                sum_of_positive_odd_numbers += number;
            }
            else{
                sum_of_positive_even_numbers += number;
            }

        } while (number != 0);
        System.out.println("Sum of negative numbers: "+sum_of_negative_numbers);
        System.out.println("Sum of Positive Even numbers: "+sum_of_positive_even_numbers);
        System.out.println("Sum of Positive Odd numbers: "+sum_of_positive_odd_numbers);

    }


}
