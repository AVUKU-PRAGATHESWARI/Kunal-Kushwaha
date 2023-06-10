package Conditionals_loops.Intermediate;

import java.util.Scanner;

public class Batting_average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Total Runs: ");
        int runs = input.nextInt();
        System.out.print("Enter the Total times out: ");
        int times_out = input.nextInt();
        float batting_score = (float) (runs) /(times_out);
        System.out.println("Batting average: "+batting_score);
    }

}
