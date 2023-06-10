package Conditionals_loops;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int a=0;
        int b=1;
        int c=1;
        for(int i=0;i<number;i++){
            System.out.print(c+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
