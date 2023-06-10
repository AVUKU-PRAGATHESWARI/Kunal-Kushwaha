package Conditionals_loops.Intermediate;

import java.util.Scanner;

public class Vowel_or_consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String character = input.next();
        int ascii=character.charAt(0);
        if( (ascii == 97) || (ascii == 101 ) || (ascii == 105) || (ascii == 111) ||(ascii == 117) || (ascii == 65) || (ascii == 69) || (ascii == 73) || (ascii == 79) || (ascii==85)){
            System.out.println("Its a vowel");
        }
        else{
            System.out.println("Its a constant");
        }
    }
}
