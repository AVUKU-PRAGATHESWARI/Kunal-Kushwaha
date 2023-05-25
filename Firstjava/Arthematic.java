package Firstjava;

import java.util.Objects;
import java.util.Scanner;

public class Arthematic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int first_number=input.nextInt();
        System.out.print("Enter Second number: ");
        int second_number=input.nextInt();
        System.out.print("Enter a operator: ");
        String operator=input.next();
        if (Objects.equals(operator, "+")){
            System.out.println("The sum of the given numbers is: "+(first_number+second_number));
        } else if (Objects.equals(operator, "-")){
            System.out.println("The difference of the given numbers is: "+(first_number-second_number));
        } else if (Objects.equals(operator, "*")) {
            System.out.println("The Multiplication of the given numbers is: " + (first_number * second_number));
        }else{
            System.out.println("The division of the given numbers is : "+(first_number/second_number));
        }
    }
}
