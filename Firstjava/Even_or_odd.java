package Firstjava;

import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=input.nextInt();
        if (number%2==0){
            System.out.println(number+" is the EVEN number");
        }
        else{
            System.out.println(number+" is the ODD number");
        }
    }
}
