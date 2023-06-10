package Conditionals_loops.Intermediate;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the base: ");
        int base = input.nextInt();
        System.out.print("enter the power: ");
        int power = input.nextInt();
        int result = 1;
        for(int i=0;i<power;i++){
            result*=base;
        }
        System.out.println("The power of "+base+" raised to the power of "+power+" is: "+result);
    }
}
