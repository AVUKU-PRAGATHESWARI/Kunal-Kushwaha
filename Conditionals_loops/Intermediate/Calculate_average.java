package Conditionals_loops.Intermediate;

import java.util.Scanner;

public class Calculate_average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N= input.nextInt();
        int sum=0;
        for(int i=0;i<N;i++){
            int number = input.nextInt();
            sum+=number;
        }
        System.out.println("Average : "+(sum/N));

    }
}
