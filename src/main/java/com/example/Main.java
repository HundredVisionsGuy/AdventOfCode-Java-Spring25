package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<String> inputs = new ArrayList<>();
        inputs = ReadFile.getInput("src/main/resources/day1_test.txt");
        for (int i=0; i<inputs.size(); i++) {
            System.out.println(inputs.get(i));
        }
    }
}