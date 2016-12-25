package com.example.newworld.calculationofelectricitycharges;

/**
 * Created by NewWorld on 12/25/2016.
 */

public class Information {
    private int spend;
    private int money;

    public Information() { // đặt giá trị mặc định = 0
        spend = 0;
        money = 0;
    }

    public Information(int Spend) {
        spend = Spend;
    }

    public void setSpend(int spend) {
        this.spend = spend;
    }

    public int getSpend() {
        return spend;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return spend + " " + money + "K";
    }

    public Information add(Information i) { // them tieu hao
        return new Information(i.spend);
    }
}
