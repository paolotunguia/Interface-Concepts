package com.company;

public class Person {
    private double coins;

    public Person(double coins) {
        this.coins = coins;
    }

    public void insertCoin(Coinable coinable) {
        System.out.println("\n1 gumball costs 1.99$");
        System.out.println("Coin/s inserted = " + coins + "$");
        if (coinable.insertCoin()) {
            coins = coins - 1.99;
            System.out.println("Coin change = " + coins + "$");
        } else if (!coinable.insertCoin()) {
            coins = coins + 0;
            System.out.println("Coin/s refunded = " + coins + "$");
        }
    }
}