package com.company;

public class Main {

    public static void main(String[] args) {
	Programmer programmer = new Programmer("Maks","Programmer","PeakSoft");
        System.out.println(programmer);
        System.out.println(programmer.coding());
        System.out.println(programmer.abstractEat());
        programmer.learn();
        programmer.walk();
        System.out.println();

    Dancer dancer = new Dancer("Bob","dancer","Style");
        System.out.println(dancer);
        System.out.println(dancer.dancing());
        System.out.println(dancer.abstractEat());
        dancer.learn();
        dancer.walk();
    }
}
