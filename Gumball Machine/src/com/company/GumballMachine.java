package com.company;

public class GumballMachine implements Coinable, Dispensable{
    int gums = 0;

    public GumballMachine() {
        this.gums = 2;
    }

    @Override
    public boolean insertCoin() {
        if(this.gums  > 0) {
            this.dispense();
            return true;
        }
        System.out.println("No gumballs remaining");
        return false;
    }

    @Override
    public void dispense() {
        this.gums--;
        System.out.println("Gum dispensed = 1");
    }

    @Override
    public void reload(double count) {
        this.gums += count;
    }
}