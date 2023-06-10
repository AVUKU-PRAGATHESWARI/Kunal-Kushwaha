package Conditionals_loops.Intermediate;

import java.util.Scanner;

public class Average_of_n_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the N value: ");
        int N = input.nextInt();
        int sum = 0;
        for(int i=1;i<=N;i++){
            System.out.print("Enter the "+i+ " element/Number: ");
            int number = input.nextInt();
            sum+=number;
        }
        System.out.println("The average of given "+N+" numbers is : "+(sum/N));
    }
}
