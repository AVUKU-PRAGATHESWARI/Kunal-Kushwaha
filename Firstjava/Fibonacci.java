package Firstjava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number up to which the series has to generate: ");
        int number=input.nextInt();
        int next,first=0,second=1;
        for(int i=0;i<number;i++){
            if (i<=0){
                next=1;
            }
            else{
                next=first+second;
                first=second;
                second=next;
            }
            System.out.print(next+" ");
        }

    }
}
