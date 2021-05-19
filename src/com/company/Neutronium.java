package com.company;

public class Neutronium extends Quark implements FlexMeson,Tachyon {
    public Neutronium(String s){
        this(42);
    }
    public Neutronium(double d){
        super(d);
    }
    public String straling() {
        return "Neutronium";
    }
    public String straling(double x){
        return "Neutronium";
    }
}
