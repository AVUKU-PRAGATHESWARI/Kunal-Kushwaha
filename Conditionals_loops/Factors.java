package Conditionals_loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Factors of "+number+" are: ");
        for(int i=1;i<=number;i++){
            if (number%i==0){
                System.out.print(i+" ");
            }

        }
    }
}
