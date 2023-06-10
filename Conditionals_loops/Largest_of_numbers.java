package Conditionals_loops;

import java.util.Scanner;

public class Largest_of_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int large =0 ,a = 0;
        System.out.println("Enter the number to get added and enter zero to exit: ");
        a = input.nextInt();
        while(a!=0){
            if (large < a){
                large = a;
            }
            a= input.nextInt();
        }
        System.out.println("The largest of given numbers is: "+large);
    }
}
