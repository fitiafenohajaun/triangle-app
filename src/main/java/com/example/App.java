package com.example;

public class App {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        System.out.println(
            "Triangle 3,4,5 valide : "
            + triangle.estValide(3,4,5)
        );

    }

}