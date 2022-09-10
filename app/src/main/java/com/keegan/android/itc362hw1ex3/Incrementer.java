package com.keegan.android.itc362hw1ex3;

public class Incrementer {
    private int amount;

    public Incrementer(int newAmount){
        setAmount(newAmount);
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount(int newAmount){
        amount = newAmount;
    }

    public int add(){
        amount = amount++;
        return amount;
    }

}
