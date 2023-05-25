package Firstjava;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principle: ");
        int p=input.nextInt();
        System.out.print("Enter the Time: ");
        int t=input.nextInt();
        System.out.print("Enter the Rate of interest: ");
        int r=input.nextInt();
        double s=(p*t*r)/100.0;
        System.out.println("The simple interest can be "+s);
    }
}
