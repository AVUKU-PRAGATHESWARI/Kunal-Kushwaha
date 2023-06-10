package Conditionals_loops;

import java.util.Scanner;

public class Subtract_the_product_and_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        int product = 1 , sum = 0 , digit = 0;
        while(integer!=0){
            digit = integer % 10;
            product*=digit;
            sum+=digit;
            integer=integer/10;
        }
        System.out.println("The difference of "+product+" and "+sum+" is: "+(product-sum));
    }
}
