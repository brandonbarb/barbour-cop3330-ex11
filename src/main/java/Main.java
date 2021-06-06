/*
 *  UCF COP3330 Summer 2021 Assignment 11 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("How many euros are you exchanging? ");
        Scanner input = new Scanner(System.in);
        double euros = input.nextDouble();
        System.out.print("What is the exchange rate? ");
        double rate = input.nextDouble();
        System.out.printf("%.0f euros at an exchange rate of %.4f is \n%.2f U.S. dollars.\n", euros, rate, (euros * rate));
    }
}
