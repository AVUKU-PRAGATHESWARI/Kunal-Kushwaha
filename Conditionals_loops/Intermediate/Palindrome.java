package Conditionals_loops.Intermediate;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.next();
        StringBuilder rev= new StringBuilder();
        for(int i=string.length()-1;i>=0;i--){
            rev.append(string.charAt(i));
        }
        String reverse= String.valueOf(rev);
        if(string.equals(reverse)){
            System.out.println("It is a Palindrome.");
        }
        else{
            System.out.println("It is not a Palindrome.");
        }
    }
}
