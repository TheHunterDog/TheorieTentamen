package com.company;

public class Quark extends Electron implements Kryptoniet{
    public Quark(double x){
        super("Electron");
    }

    @Override
    public String massa() {
        return "Quark";
    }

    @Override
    public double rotatie(double x) {
        return 42;
    }
}
