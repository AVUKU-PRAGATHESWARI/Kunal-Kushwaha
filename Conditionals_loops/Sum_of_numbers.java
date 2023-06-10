package Conditionals_loops;

import java.util.Scanner;

public class Sum_of_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum =0 ,a = 0;
        System.out.println("Enter the number to get added and enter zero to exit: ");
        a = input.nextInt();
        while(a!=0){
            sum+=a;
            a= input.nextInt();
        }
        System.out.println("The sum of given numbers is: "+sum);
    }
}
