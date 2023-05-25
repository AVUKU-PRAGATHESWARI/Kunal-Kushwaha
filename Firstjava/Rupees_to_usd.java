package Firstjava;

import java.util.Scanner;

public class Rupees_to_usd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rupees to convert to USD: ");
        int rupees = input.nextInt();
        float usb=(rupees/82.6775f);
        System.out.println("The USB equivalent to the given rupees is: "+usb);

    }
}
