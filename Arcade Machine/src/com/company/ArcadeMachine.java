package com.company;

public class ArcadeMachine implements Coinable, Dispensable {

    int insert;

    public ArcadeMachine() {
        this.insert = 100;
    }

    public void dispense() {
        this.insert--;
        System.out.println("Starting game . . .");
        System.out.println("Killing zombies . . .");
        System.out.println("Game Ended . . .");
    }

    public void reload(int count) {
        this.insert =+ count;
    }

    public boolean insertCoin() {
        if (this.insert > 0) {
            this.dispense();
            return true;
        }

        return false;
    }
}