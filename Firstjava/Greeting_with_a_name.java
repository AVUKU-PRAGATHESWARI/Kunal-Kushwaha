package Firstjava;

import java.util.Scanner;

public class Greeting_with_a_name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("May i know your good name please: ");
        String name=input.nextLine();
        System.out.println("Hello "+name+"\n"+"Nice to meet you....");
    }
}
