package Firstjava;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=input.nextInt();
        int temp=number;
        int sum=0;
        String str_of_num=String.valueOf(number);
        int length=str_of_num.length();
        int digit;
        while(temp!=0){
            digit=temp%10;
            temp=temp/10;
            sum+=(Math.pow(digit,length));
        }
        if (sum==number){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }
    }
}
