package org.example;

import org.example.interfaces.I1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        I1.type();

        I1 ii = () -> {
            System.out.println("Calling abstract");
        };

        ii.check();
        ii.speed();

    }

}