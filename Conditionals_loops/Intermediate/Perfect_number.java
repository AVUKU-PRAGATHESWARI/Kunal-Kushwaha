package Conditionals_loops.Intermediate;

import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        for(int i=1;i<number;i++){
            if(number % i ==0){
                sum += i;
            }
        }
        if(sum==number){
            System.out.println(number+" is a Perfect Number.");
        }
        else{
            System.out.println(number+" is not a Perfect Number.");
        }
    }
}
