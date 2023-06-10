package Conditionals_loops.Intermediate;

import java.util.Scanner;

public class Reverse_a_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String string = input.next();
        StringBuilder reverse= new StringBuilder();
        for(int i=string.length()-1;i>=0;i--){
            reverse.append(string.charAt(i));
        }
        System.out.println("Reverse of given string is: "+reverse);
    }
}
