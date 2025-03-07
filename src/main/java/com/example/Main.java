package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<String> inputs;
        inputs = ReadFile.getInput("src/main/resources/day1_test.txt");
        if (inputs.size() > 0) {
            for (int i=0; i<inputs.size(); i++) {
                System.out.println(inputs.get(i));
            }
        }
        else {
            System.out.println("Ooops!");
        }
    }
}