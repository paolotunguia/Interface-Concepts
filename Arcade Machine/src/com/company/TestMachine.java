package com.company;

import java.util.Scanner;

public class TestMachine {
    public static void main (String[] args) {

        ArcadeMachine arcadeMachine = new ArcadeMachine();

        Scanner input = new Scanner(System.in);

        char choice;

        Person person = new Person(6);

        System.out .println("\n--Arcade Machine--");
        System.out .println("Coins required to play = 3 coins");

        do {
        person.insertCoin(arcadeMachine);

            System.out.print("\nEnter \"P\" to play again or \"any\" key to exit: ");
            choice = input.next().charAt(0);
        } while ((choice == 'P') || (choice == 'p'));

        System.out.println("\nThanks for playing!");

    }
}