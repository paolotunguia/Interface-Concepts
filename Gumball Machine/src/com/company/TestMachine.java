package com.company;

import java.util.Scanner;

public class TestMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char choice;

        GumballMachine gumballMachine = new GumballMachine();
        Person person = new Person(10);

        System.out.println("\n--Gumball Machine--");

        do {
            person.insertCoin(gumballMachine);

            System.out.print("\nEnter \"I\" to insert coins again or \"any\" key to exit: ");
            choice = input.next().charAt(0);
        } while ((choice == 'I') || (choice == 'i'));

        System.out.println("\nThank you for purchasing!");
    }
}