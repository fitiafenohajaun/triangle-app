package com.example;

public class Triangle {

    public boolean estValide(int a, int b, int c) {
        return a + b > c &&
               a + c > b &&
               b + c > a;
    }

}