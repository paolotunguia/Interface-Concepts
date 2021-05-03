package com.company;

public class Person {
    int coins, count;

    public Person(int coins) {
        this.coins = coins;
        this.count = 3;
    }

    public void insertCoin( Coinable coinable) {
        System.out.println("\nCoin/s Inserted: " + coins + " coins");


        if (coins >= 3) {
            if(!coinable.insertCoin()) {
            } else {
                coins = coins - count;
                System.out.println("Coin/s left: " + coins + " coins");
            }
        } else {
            System.out.println("Insufficient coins!");
            System.out.println("Unable to start game");
            System.out.println("Coins returned");
        }
    }


}