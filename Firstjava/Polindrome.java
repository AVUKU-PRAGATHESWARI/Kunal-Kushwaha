package Firstjava;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = input.next();
        String reverse = "";
        int length=string.length();
        for(int i=length-1;i>=0;i--){
            reverse=reverse.concat(String.valueOf(string.charAt(i)));
        }
        if (string.equals(reverse)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
